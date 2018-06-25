
package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamen;
import sr.unasat.intekenlijst.repositories.TentamenRepository;

import java.util.List;

public class InsertTentamen {

    public static void main(String[] args) {

        TentamenRepository tentamenRepo = new TentamenRepository();
        Tentamen t = new Tentamen(48, "NW", "Netwerken", "2019-01-23", "08:00", "2 uren", "Regulier tentamen");
        tentamenRepo.insertOneRecord(t);

    }
}

