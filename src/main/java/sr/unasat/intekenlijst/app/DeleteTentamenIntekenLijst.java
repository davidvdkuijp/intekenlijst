package sr.unasat.intekenlijst.app;

import java.lang.String;
import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;

import java.util.List;


public class DeleteTentamenIntekenLijst {

    public static void main(String[] args) {

        TentamenIntekenLijstRepository TentaIntekenRepo = new TentamenIntekenLijstRepository();
        List<Tentamenintekenlijst> TentaIntekenList = TentaIntekenRepo.findAllRecords();
        for (Tentamenintekenlijst TentaIntekenLijst : TentaIntekenList) {
            System.out.println(TentaIntekenLijst);
        }

        Tentamenintekenlijst deleterow = new Tentamenintekenlijst(92);
        System.out.println(TentaIntekenRepo.deleteRecord(deleterow));


             TentaIntekenList = TentaIntekenRepo.findAllRecords();
        for (Tentamenintekenlijst TentaIntekenLijst : TentaIntekenList) {
            System.out.println(TentaIntekenLijst.getINTEKEN_ID() + " " + TentaIntekenLijst.getSTUDENTVOORNAAM());
        }
    }
}
