package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;

public class UpdateTentamenIntekenLijst {

    public static void main(String[] args) {

        TentamenIntekenLijstRepository tilRep = new TentamenIntekenLijstRepository();
        Tentamenintekenlijst firstRow = new Tentamenintekenlijst(8,61 , 70 );

        tilRep.updateRecord(firstRow);

        System.out.println("Record: " + tilRep); // moet ("Record: " + firstRow) zijn


    }
}
