package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;

public class InsertTentamenIntekenLijst {

    public static void main(String[] args) {

        TentamenIntekenLijstRepository tentamenIntekLijstRepo = new TentamenIntekenLijstRepository();
        Tentamenintekenlijst t = new Tentamenintekenlijst(100, 6, "Narain", "Maarten", 55, "Java", "2019-02-20", "2019-02-20", "JA");
        tentamenIntekLijstRepo.insertRecordTentaIntekenLijst(t);

        System.out.println(t);

    }
}
