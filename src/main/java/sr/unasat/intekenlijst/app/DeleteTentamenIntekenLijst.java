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

        Tentamenintekenlijst TentaIntekenLijst1 = new Tentamenintekenlijst(1);
        System.out.println(TentaIntekenRepo.deleteOneRecord(TentaIntekenLijst1));


             TentaIntekenList = TentaIntekenRepo.findAllRecords();
        for (Tentamenintekenlijst TentaIntekenLijst : TentaIntekenList) {
            System.out.println(TentaIntekenLijst);
        }
    }
}
