package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;

import java.util.List;

public class InsertTentamenIntekenLijst {                           // insert into tabel

    public static void main(String[] args) {

        TentamenIntekenLijstRepository tentamenIntekLijstRepo = new TentamenIntekenLijstRepository();  // omdat
        List<Tentamenintekenlijst> TentaIntekenList = tentamenIntekLijstRepo.findAllRecords();
        for (Tentamenintekenlijst TentaIntekenLijst : TentaIntekenList) {
            System.out.println(TentaIntekenLijst);
        }

        Tentamenintekenlijst t = new Tentamenintekenlijst(518, 6, "Narain", "Maarten", 55, "Java", "2019-02-20", "2019-02-20", "JA");
        tentamenIntekLijstRepo.insertRecordTentaIntekenLijst(t);

        System.out.println(t);

    }
}
