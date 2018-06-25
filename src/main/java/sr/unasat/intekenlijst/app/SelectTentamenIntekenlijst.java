package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;

import java.util.List;

public class SelectTentamenIntekenlijst {
    public static void main(String[] args) {
        TentamenIntekenLijstRepository TilRepo = new TentamenIntekenLijstRepository();
        List<Tentamenintekenlijst> TILList = TilRepo.SelectTentaInteken();
        for (Tentamenintekenlijst tentamenintekenlijst : TILList) {
            System.out.println(tentamenintekenlijst.getSTUDENTVOORNAAM());
        }


        }
    }

