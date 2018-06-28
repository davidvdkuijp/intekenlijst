package sr.unasat.intekenlijst.repositories;

import sr.unasat.intekenlijst.entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository          //http://archive.oreilly.com/oreillyschool/courses/java4/java411.html

{
    private Connection connection;      // The database connection object.

    public StudentRepository() {        // the constructor for the database manager.
        try {
            Class.forName("com.mysql.jdbc.Driver");     // get the driver for this database.
            System.out.println("Het systeem werkt");

            String URL = "jdbc:mysql://localhost/tentamen_intekenlijst";
            String USER = "root";                       // our database--username
            String PASS = "admin";
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println(connection);
        } catch (ClassNotFoundException ex) {           // als de connection niet lukt
            System.out.println("Class can not load");
            System.exit(1);
        } catch (SQLException e) {                      // Als er een fout is die niet SQL gereleateerd is. gaat het dat pakken en printen
            e.printStackTrace();
        }

    }

    public List<Student> findAllRecords() {
        List<Student> studentList = new ArrayList<Student>();           // Arraylist is een (constructor) list met geen vaste size (het is scalable) hier maak je een object aan
        Statement stmt = null;                                          // implementing simple SQL statements with no parameters;
        try {
            stmt = connection.createStatement();
            String sql = "select * from Student";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("resultset: " + rs);
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int STUDENT_ID = rs.getInt("STUDENT_ID");
                String NAAM = rs.getString("NAAM");
                String VOORNAAM = rs.getString("VOORNAAM");
                String EMAIL = rs.getString("EMAIL");
                String STUDENTENNUMMER = rs.getString("STUDENTENNUMMER");
                String ADRES = rs.getString("ADRES");
                String CONTACTNUMMER = rs.getString("CONTACTNUMMER");
                String GESLACHT = rs.getString("GESLACHT");
                String GEBOORTEDATUM = rs.getString("GEBOORTEDATUM");

               //Display values
               /*System.out.print("ID: " + STUDENT_ID);
               System.out.print(", Student: " + NAAM +" "+ VOORNAAM);*/
              studentList.add(new Student(STUDENT_ID, NAAM,VOORNAAM,EMAIL,STUDENTENNUMMER,ADRES,CONTACTNUMMER,GESLACHT,GEBOORTEDATUM));

            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return studentList;
    }

  }




