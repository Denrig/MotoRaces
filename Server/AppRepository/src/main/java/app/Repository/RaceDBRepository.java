package app.Repository;


import app.Domain.Engine;
import app.Domain.Race;
import app.Domain.Racer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;


public class RaceDBRepository implements CrudRepository<Long, Race> {

    //Connection provider
    private static JDBCutils jdbCutils=null;

    public RaceDBRepository(Properties props) {
        jdbCutils=new JDBCutils(props);
    }


    @Override
    public Race findOne(Long aLong) throws IllegalArgumentException {
        if(aLong==null||aLong<0)
            throw new IllegalArgumentException("ID trebuie sa fie diferit de null si >0");
        else {
            try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("SELECT l.id, l.date, l.engine,count(racer_id) FROM  racer_races rr right outer JOIN  races l ON l.id = rr.race_id left outer JOIN  racer p ON p.id =rr.racer_id where race_id=? GROUP BY l.id,l.date, l.engine"))
            { statement.setInt(1,aLong.intValue());
                ResultSet set=statement.executeQuery();
                if(set.next())
                return parse(set);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Iterable<Race> findAll() {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("SELECT l.id, l.date, l.engine,count(racer_id) FROM  racer_races rr right outer JOIN  races l ON l.id = rr.race_id left outer JOIN  racer p ON p.id =rr.racer_id GROUP BY l.id,l.date, l.engine")){
            ArrayList<Race> list=new ArrayList<>();
            ResultSet set=statement.executeQuery();
            //While the resultset is not empty parses the info and adds it to the list
            while (set.next()){
                list.add(parse(set));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Race save(Race entity) throws IllegalArgumentException {
        entity.setId(getLastID());
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("insert into races(id,engine,date) values(?,?,?)")) {
            statement.setInt(1,entity.getId().intValue());
            statement.setString(2,entity.getEngine().toString());
            statement.setDate(3, Date.valueOf(entity.getDate()));
            // Check if any changes are made in database
            if(statement.executeUpdate()!=0){
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public Race delete(Long aLong) throws IllegalArgumentException {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("delete from racer_races where race_id=?;delete from races where id=?; ")){
            statement.setInt(1,aLong.intValue());
            statement.setInt(2,aLong.intValue());
            Race racer=findOne(aLong);
            // Check if any changes are made in database
            if(statement.executeUpdate()!=0)
                return racer;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Race update(Race entity) throws IllegalArgumentException{

        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("update races set date=?,engine=? where id=?")){
            statement.setInt(3,entity.getId().intValue());
            statement.setString(2,entity.getEngine().toString());
            statement.setDate(1, Date.valueOf(entity.getDate()));
         // Check if any changes are made in database
            if(statement.executeUpdate()!=0)
            {return entity;
            }
            return null;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public Long getLastID(){
        try (PreparedStatement statement = jdbCutils.getConnection().prepareStatement("select id from races where id>0 order by id asc")) {
            ResultSet data = statement.executeQuery();
            Long i = 1l;
            while (data.next()) {
                if (data.getLong("id") != i)
                    return i;
                i++;
            }
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Race parse(ResultSet set){
        try {
            return new Race(set.getLong("id"), Engine.valueOf(set.getString("engine")),set.getDate("date").toLocalDate(),Integer.parseInt(set.getString("count")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Adds a racer to a specific race

    public boolean addToRace(Racer racer, Race race){
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("insert into racer_races(racer_id,race_id) values(?,?)")) {
            statement.setInt(1,racer.getId().intValue());
            statement.setInt(2,race.getId().intValue());
            if(statement.executeUpdate()!=0)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
