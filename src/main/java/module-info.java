module pl.lublin.wsei.java.cwiczenia.lab3b {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens pl.lublin.wsei.java.cwiczenia.lab3b to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab3b;
}