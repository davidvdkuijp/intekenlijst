
package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamen;
import sr.unasat.intekenlijst.repositories.TentamenRepository;


public class InsertTentamen {                                   // Create handeling van CRUD

    public static void main(String[] args) {

        TentamenRepository tentamenRepo = new TentamenRepository();
        Tentamen t = new Tentamen(75, "NW", "TEST", "2019-01-23", "08:00", "2 uren", "Regulier tentamen");
        tentamenRepo.insertRecordTenta(t);


        System.out.println(t);          // is er niet in code van meneer en is om te zien  welke records je hebt geinsert
    }
}

