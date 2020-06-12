package app.Repository;

import app.Domain.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;



public class UserRepository {
        JDBCutils jdbCutils=null;
    public UserRepository(Properties properties) {
        jdbCutils=new JDBCutils(properties);
    }
    public User login(User user){
        try (PreparedStatement statement=jdbCutils.getConnection().prepareStatement("select * from users where id=? and pass=?")){
            statement.setString(1,user.getId());
            statement.setString(2,user.getPasswd());
            ResultSet set=statement.executeQuery();
            if(set.next())
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}



