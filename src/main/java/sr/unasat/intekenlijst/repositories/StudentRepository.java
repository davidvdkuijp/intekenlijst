package sr.unasat.intekenlijst.repositories;

import sr.unasat.intekenlijst.entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentRepository {
    private Connection connection;

    public StudentRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Het systeem werkt");

            String URL = "jdbc:mysql://localhost/tentamen_intekenlijst";
            String USER = "root";
            String PASS = "admin";
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println(connection);
        } catch (ClassNotFoundException ex) {
            System.out.println("Class can not load");
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Student> findAllRecords() {
        List<Student> studentList = new ArrayList<Student>();
        Statement stmt = null;
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
                Date GEBOORTEDATUM = rs.getDate("GEBOORTEDATUM");

            /*    //Display values
               System.out.print("ID: " + id);
               System.out.print(", Age: " + naam);*/
                studentList.add(new Student(STUDENT_ID, NAAM,VOORNAAM,EMAIL,STUDENTENNUMMER,ADRES,CONTACTNUMMER,GESLACHT,GEBOORTEDATUM));
                //  persoonList.add(new Persoon(rs.getInt("id"), rs.getString("naam")));
            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return studentList;
    }

    public int insertOneRecord(Student student) {
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "insert into student (NAAM) values(?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, student.getNAAM());
            result = stmt.executeUpdate();
            System.out.println("resultset: " + result);

        } catch (SQLException e) {

        } finally {

        }
        return result;
    }

    public int deleteOneRecord(Student student){
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "DELETE FROM student WHERE student.STUDENTEN_ID = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, student.getSTUDENT_ID());
            result = stmt.executeUpdate();
            System.out.println("deleted: " + student.getSTUDENT_ID());

        } catch (SQLException e) {

        } finally {

        }
        return result;
    }

}




