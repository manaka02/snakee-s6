package manaka.s6.snakee.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    private Connection connection;
    
    public Connection getConnection(){
        if(connection == null){
            String url = "jdbc:postgresql://localhost/snakee";
            String user = "postgres";
            String password = "root";
            try {
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(DBConnect.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
            System.out.println("Namorona connection vaovao le ol");
        }
        return connection;
    }
}