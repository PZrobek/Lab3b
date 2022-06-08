package pl.lublin.wsei.java.cwiczenia.lab3b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {

    private final String host;
    private final String dbName;
    private final Number port;
    private String user;
    private String password;
    private Connection conn = null;

    public MyDB(String host, Number port, String dbName){
        this.host = host;
        this.dbName = dbName;
        this.port = port;
    }

    public void setUser(String user){
        this.user = user;
    }
    public void setPassword(String password){
        this.password = password;
    }

    private void connect(){
        Properties connectionProps = new Properties();
        connectionProps.put("user","root");
        connectionProps.put("password","student");
        connectionProps.put("serverTimezone","Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" +dbName;
        try{
            conn = DriverManager.getConnection(
                    jdbcString, connectionProps);
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: "+jdbcString);
            System.out.println("Komunikat błędu: "+e.getMessage());
            conn = null;
        }
        System.out.println("Connected to database "+dbName);
    }

    public Connection getConnection(){
        if (conn == null)
            connect();
        return conn;
    }
}
