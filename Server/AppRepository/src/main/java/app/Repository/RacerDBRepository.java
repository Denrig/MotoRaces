package app.Repository;

import app.Domain.Engine;
import app.Domain.Racer;
import app.Domain.Team;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

@Component
public class RacerDBRepository implements RacerRepository {
    private static JDBCutils jdbCutils=new JDBCutils();

    public RacerDBRepository(Properties props) {
      jdbCutils=new JDBCutils(props);
    }
    //Finds all the racers that are singed up with a specific team
    @Override
    public Iterable<Racer> findByTeam(Team team) {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("select * from racer where racer.team=?")){
            statement.setString(1,team.toString());
            ArrayList<Racer> list=new ArrayList<>();
            ResultSet set=statement.executeQuery();
            while (set.next()){
                list.add(parse(set));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //Finds all the racers that are singed up to a specific race
    @Override
    public Iterable<Racer> findByRace(Long id) {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("select * from racer inner join racer_races on racer.id=racer_id where race_id=?")){
            statement.setInt(1,id.intValue());
            ArrayList<Racer> list=new ArrayList<>();
            ResultSet set=statement.executeQuery();
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
    public Racer findOne(Long aLong) throws IllegalArgumentException {
        if(aLong==null||aLong<0)
            throw new IllegalArgumentException("ID trebuie sa fie diferit de null si >0");
        else {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("select * from racer where id=?"))
        { statement.setInt(1,aLong.intValue());
          ResultSet set=statement.executeQuery();
          //If the result is not empty
          if(set.next())
          return parse(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    return null;
    }

    @Override
    public Iterable<Racer> findAll()  {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("select * from racer")){
            ArrayList<Racer> list=new ArrayList<>();
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
    public Racer save(Racer entity) throws  IllegalArgumentException {
        entity.setId(getLastID());
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("insert into racer(id,nume,team,engine) values(?,?,?,?)")) {
            statement.setInt(1,entity.getId().intValue());
            statement.setString(2,entity.getName());
            statement.setString(3,entity.getTeam().toString());
            statement.setString(4,entity.getEngine().toString());
            // Check if any changes are made in database
            if(statement.executeUpdate()!=0){
                return entity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Racer delete(Long aLong) throws  IllegalArgumentException {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("delete from racer where id=?;delete from racer_races where racer_id=?")){
            statement.setInt(1,aLong.intValue());
            statement.setInt(2,aLong.intValue());
            Racer racer=findOne(aLong);
            // Check if any changes are made in database
            if(statement.executeUpdate()!=0)
                return racer;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Racer update(Racer entity) throws IllegalArgumentException {
        try(PreparedStatement statement=jdbCutils.getConnection().prepareStatement("update racer set nume=?,team=?,engine=? where id=?")){
            statement.setInt(4,entity.getId().intValue());
            statement.setString(1,entity.getName());
            statement.setString(2,entity.getTeam().toString());
            statement.setString(3,entity.getEngine().toString());
            // Check if any changes are made in database
            if(statement.executeUpdate()!=0)
                return null;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return entity;
    }
    /*
    Get the last available id in the database
     */
    @Override
    public Long getLastID() {
        try (PreparedStatement statement = jdbCutils.getConnection().prepareStatement("select id from racer where id>0 order by id asc")) {
            ResultSet data = statement.executeQuery();
            Long i = 1l;
            //If the diffrence between 2 id's is not equal with 1 then that is an available id
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
    //Casts the resultset's data into a Racer entity
    private Racer parse(ResultSet set){
        try {
            return new Racer(set.getLong("id"),Team.valueOf(set.getString("team")), Engine.valueOf(set.getString("engine")),set.getString("nume"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
