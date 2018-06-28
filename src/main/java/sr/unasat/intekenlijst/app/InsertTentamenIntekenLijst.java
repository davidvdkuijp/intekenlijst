package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;

import java.util.List;

public class InsertTentamenIntekenLijst {                           // insert into tabel werkt nog niet egt bij menneer moet het veranderen ( is insert op table 3)

    public static void main(String[] args) {
    // het ging niet omdat je eerst de alle records moet oproepen  en danpas kan delete
        TentamenIntekenLijstRepository tentamenIntekLijstRepo = new TentamenIntekenLijstRepository();  // object aanmaken door constructor
        List<Tentamenintekenlijst> TentaIntekenList = tentamenIntekLijstRepo.findAllRecords();          //method oproepen findAllRecords
        // for loop is hier niet nodig eigelijk omdat het niet egt wordt gebruikt voor die insert
        for (Tentamenintekenlijst TentaIntekenLijst : TentaIntekenList) {                               // for loop
            System.out.println(TentaIntekenLijst);                                                      // print tentaIntekenLijst
        }

        Tentamenintekenlijst t = new Tentamenintekenlijst(0, 6, "Narain", "Maarten", 55, "Java", "2019-02-20", "2019-02-20", "JA"); // maak nog een object aan
        tentamenIntekLijstRepo.insertRecordTentaIntekenLijst(t); // roep method op en insert into tentamen intekenlijst

        System.out.println(t); // print inserted record

    }
}
