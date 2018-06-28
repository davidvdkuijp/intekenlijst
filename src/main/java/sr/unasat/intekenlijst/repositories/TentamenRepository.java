package sr.unasat.intekenlijst.repositories;

import sr.unasat.intekenlijst.entities.Tentamen;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TentamenRepository {
    private Connection connection;
    public TentamenRepository (){

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

    public List<Tentamen> findAllRecords() {
        List<Tentamen> tentamenList = new ArrayList<Tentamen>();
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            stmt = connection.createStatement();
            String sql = "select * from Tentamen";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("resultset: " + rs);
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int TENTAMEN_ID = rs.getInt("TENTAMEN_ID");
                String VAK = rs.getString("VAK");
                String OMSCHRIJVING = rs.getString("OMSCHRIJVING");
                String TENTAMENDATUM = rs.getString("TENTAMENDATUM");
                String TENTAMENSTARTTIJD = rs.getString("TENTAMENSTARTTIJD");
                String TENTAMENDUUR = rs.getString("TENTAMENDUUR");
                String TENTAMENTYPE = rs.getString("TENTAMENTYPE");


                tentamenList.add(new Tentamen(TENTAMEN_ID,VAK,OMSCHRIJVING,TENTAMENDATUM,TENTAMENSTARTTIJD,TENTAMENDUUR,TENTAMENTYPE));

            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return tentamenList;
    }

    public int insertRecordTenta (Tentamen tentamen) {
        PreparedStatement stmt = null;                                            // Ddefine preparedstatement
        int result = 0;
        try {
            String sql = "insert into tentamen (VAK, OMSCHRIJVING, TENTAMENDATUM, TENTAMENSTARTTIJD, TENTAMENDUUR, TENTAMENTYPE) values(?,?,?,?,?,?)";
            stmt = connection.prepareStatement(sql);                            //perpared statements =Used for precompiling SQL statements that might contain input parameters
            stmt.setString(1, tentamen.getVAK());
            stmt.setString(2, tentamen.getOMSCHRIJVING());
            stmt.setString(3, tentamen.getTENTAMENDATUM() );
            stmt.setString(4, tentamen.getTENTAMENSTARTTIJD());
            stmt.setString(5,tentamen.getTENTAMENDUUR());
            stmt.setString(6, tentamen.getTENTAMENTYPE() );
            result = stmt.executeUpdate();
            System.out.println("resultset: " + result);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        } finally {

        }
        return result;
    }


    }

