package app.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
    Singleton Class
    Handles Database Connections
 */
public class JDBCutils {
    private Properties jdbcProps;
    private static final Logger logger= (Logger) LogManager.getRootLogger();
    public JDBCutils(){}
    public JDBCutils(Properties props){
        jdbcProps=props;
    }
    private  Connection instance=null;
    //Private function that creates a new connection
    private Connection getNewConnection(){
        logger.traceEntry();
        //Gets credentials from Properties
        String driver=jdbcProps.getProperty("jdbc.driver");
        String url=jdbcProps.getProperty("jdbc.url");
        String user=jdbcProps.getProperty("jdbc.user");
        String pass=jdbcProps.getProperty("jdbc.pass");
        logger.trace("trying to connect to database ... {}",url);
        Connection con=null;
        try {
            //Try to connect
            if (!pass.equals("")&&!pass.equals(""))
                con= DriverManager.getConnection(url,user,pass);
            else
                con=DriverManager.getConnection(url);
        } catch (SQLException  e) {
            logger.error(e);
            System.out.println("Error getting connection "+e);
        }
        return con;
    }

    //Public function that returns a connection instance or creates one then returns it

    public Connection getConnection(){
        logger.traceEntry();
        try {
            if (instance==null || instance.isClosed())
                instance=getNewConnection();

        } catch (SQLException e) {
            logger.error(e);
            System.out.println("Error DB "+e);
        }
        logger.traceExit(instance);
        return instance;
    }
}
