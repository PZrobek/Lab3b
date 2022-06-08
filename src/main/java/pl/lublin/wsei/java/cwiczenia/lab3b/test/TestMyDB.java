package pl.lublin.wsei.java.cwiczenia.lab3b.test;

import pl.lublin.wsei.java.cwiczenia.lab3b.MyDB;

import java.sql.Connection;

public class TestMyDB {
    public static void main(String[] args) {
        MyDB db = new MyDB("localhost", 3306, "mydb");
        db.setUser("root");
        db.setPassword("student");
        Connection conn = db.getConnection();
        if (conn != null)
            System.out.println("Połączenie z bazą danych nawiązane");
    }
}
