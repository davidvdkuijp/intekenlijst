package sr.unasat.intekenlijst.repositories;


import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TentamenIntekenLijstRepository {

    private Connection connection;

    public TentamenIntekenLijstRepository() {

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
    public List<Tentamenintekenlijst> findAllRecords() {
        List<Tentamenintekenlijst> tentamenintekenlijstList = new ArrayList<Tentamenintekenlijst>();
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            String sql = "select * from Tentamenintekenlijst";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("resultset: " + rs);
            //STEP 5: Extract data from result set
            while ( rs.next() ) {
                //Retrieve by column name
                int INTEKEN_ID = rs.getInt("INTEKEN_ID");
                int STUDENTID = rs.getInt("STUDENTID");
                String STUDENTNAAM = rs.getString("STUDENTNAAM");
                String STUDENTVOORNAAM = rs.getString("STUDENTVOORNAAM");
                int TENTAMENID = rs.getInt("TENTAMENID");
                String TENTAMENNAAM = rs.getString("TENTAMENNAAM");
                Date INTEKEN_DATUM = rs.getDate("INTEKEN_DATUM");
                Date UITEKEN_DATUM = rs.getDate("UITEKEN_DATUM");
                String INGETEKEND = rs.getString("INGETEKEND");
           
                
                 /*    //Display values
               System.out.print("ID: " + id);
               System.out.print(", Age: " + naam);*/
                tentamenintekenlijstList.add(new Tentamenintekenlijst(INTEKEN_ID, STUDENTID,STUDENTNAAM,STUDENTVOORNAAM,TENTAMENID,TENTAMENNAAM,INTEKEN_DATUM,UITEKEN_DATUM,INGETEKEND));
                //  persoonList.add(new Persoon(rs.getInt("id"), rs.getString("naam")));
            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return tentamenintekenlijstList;
    }

    public int insertOneRecord(Tentamenintekenlijst tentamenintekenlijst) {
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "insert into tentamentintekenlijst (INGETEKEND) values(?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, tentamenintekenlijst.getINGETEKEND());
            result = stmt.executeUpdate();
            System.out.println("resultset: " + result);

        } catch (SQLException e) {

        } finally {

        }
        return result;
    }

    public int deleteOneRecord(Tentamenintekenlijst tentamenintekenlijst){
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "DELETE FROM tentamenintekenlijst WHERE tentamenintekenlijst.INTEKEN_ID = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, tentamenintekenlijst.getINTEKEN_ID());
            result = stmt.executeUpdate();
            System.out.println("deleted: " + tentamenintekenlijst.getINTEKEN_ID());

        } catch (SQLException e) {

        } finally {

        }
        return result;
    }

}
