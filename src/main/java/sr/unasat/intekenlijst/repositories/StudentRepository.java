package sr.unasat.intekenlijst.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentRepository {
    private Connection connection;

    public StudentRepository() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Het systeem werkt");

            String URL = "jdbc:mysql://localhost/beroepsproduct";
            String USER = "root";
            String PASS = "admin"
            connection = DriverManager.getConnection(URL,USER,PASS);
            System.out.println(connection);
        }    catch (ClassNotFoundException ex) {
            System.out.println("Class can not load");
            System.exit(1);
        }   catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
public int

