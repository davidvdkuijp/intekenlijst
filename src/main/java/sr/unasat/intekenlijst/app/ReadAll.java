package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Student;
import sr.unasat.intekenlijst.entities.Tentamen;
import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.StudentRepository;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;
import sr.unasat.intekenlijst.repositories.TentamenRepository;

import java.util.List;

public class ReadAll {

    public static void main(String[] args) {
        StudentRepository StudentRepo = new StudentRepository();
        List<Student> StudentList = StudentRepo.findAllRecords();
        for (Student student : StudentList) {
            System.out.println(student);
        }

        TentamenRepository TentamenRepo = new TentamenRepository();
        List<Tentamen> tentamenList = TentamenRepo.findAllRecords();
        for (Tentamen tentamen : tentamenList) {
            System.out.println(tentamen);
        }

        TentamenIntekenLijstRepository TILRepo = new TentamenIntekenLijstRepository();
        List<Tentamenintekenlijst> TILList = TILRepo.findAllRecords();
        for (Tentamenintekenlijst tentamenintekenlijst : TILList) {
            System.out.println(tentamenintekenlijst);
        }

    }


}
