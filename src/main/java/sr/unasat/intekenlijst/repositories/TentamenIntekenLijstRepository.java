package sr.unasat.intekenlijst.repositories;


import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;

import java.sql.*;
import java.util.ArrayList;
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
                String INTEKEN_DATUM = rs.getString("INTEKEN_DATUM");
                String UITEKEN_DATUM = rs.getString("UITEKEN_DATUM");
                String INGETEKEND = rs.getString("INGETEKEND");
           
                
                tentamenintekenlijstList.add(new Tentamenintekenlijst(INTEKEN_ID, STUDENTID,STUDENTNAAM,STUDENTVOORNAAM,TENTAMENID,TENTAMENNAAM,INTEKEN_DATUM,UITEKEN_DATUM,INGETEKEND));

            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return tentamenintekenlijstList;
    }


    public int deleteRecord(Tentamenintekenlijst tentamenintekenlijst){
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "DELETE FROM tentamenintekenlijst WHERE INTEKEN_ID = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1,tentamenintekenlijst.getINTEKEN_ID() );
            stmt.executeUpdate();


            System.out.println("deleted: " + tentamenintekenlijst.getINTEKEN_ID() + " " + tentamenintekenlijst.getSTUDENTNAAM()+ " " + tentamenintekenlijst.getSTUDENTVOORNAAM());

        } catch (SQLException e) {
            System.out.println(" ");

        } finally {

        }
        return result;
    }

    public int updateRecord(Tentamenintekenlijst tilRep) {
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "update tentamenintekenlijst ti  set ti.STUDENTID = ?, ti.TENTAMENID = ? where ti.INTEKEN_ID = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, tilRep.getSTUDENTID());
            stmt.setInt(2, tilRep.getTENTAMENID());
            stmt.setInt(3,tilRep.getINTEKEN_ID() );
            result = stmt.executeUpdate();
            System.out.println("resultset: " + result);

        } catch (SQLException e) {

        } finally {

        }
        return result;

}
public List<Tentamenintekenlijst> SelectTentaInteken () {
    List<Tentamenintekenlijst> tentamenintekenlijstList = new ArrayList<Tentamenintekenlijst>();
    PreparedStatement stmt = null;
    int result = 0;

    try {
        String sql = "Select * FROM TENTAMENINTEKENLIJST";
        stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("resultset: " + rs);

        while ( rs.next() ) {
            //Retrieve by column name
            int INTEKEN_ID = rs.getInt("INTEKEN_ID");
            int STUDENTID = rs.getInt("STUDENTID");
            String STUDENTNAAM = rs.getString("STUDENTNAAM");
            String STUDENTVOORNAAM = rs.getString("STUDENTVOORNAAM");
            int TENTAMENID = rs.getInt("TENTAMENID");
            String TENTAMENNAAM = rs.getString("TENTAMENNAAM");
            String INTEKEN_DATUM = rs.getString("INTEKEN_DATUM");
            String UITTEKEN_DATUM = rs.getString("UITTEKEN_DATUM");
            String INGETEKEND = rs.getString("INGETEKEND");


            tentamenintekenlijstList.add(new Tentamenintekenlijst(INTEKEN_ID, STUDENTID,STUDENTNAAM,STUDENTVOORNAAM,TENTAMENID,TENTAMENNAAM,INTEKEN_DATUM,UITTEKEN_DATUM,INGETEKEND));

        }
        rs.close();
    }
    catch (SQLException e)
    {
        System.out.println("");
            }

            finally {

    }
return  tentamenintekenlijstList;

}


}
