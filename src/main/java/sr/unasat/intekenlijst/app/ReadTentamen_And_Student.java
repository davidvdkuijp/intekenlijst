package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Student;
import sr.unasat.intekenlijst.entities.Tentamen;
import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.StudentRepository;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;
import sr.unasat.intekenlijst.repositories.TentamenRepository;

import java.util.List;

public class ReadTentamen_And_Student {

    public static void main(String[] args) {                            // main method
        StudentRepository StudentRepo = new StudentRepository();        // object aanmaken door constructor
        List<Student> StudentList = StudentRepo.findAllRecords();       //method oproepen
        for (Student student : StudentList) {                           //for loop
            System.out.println(student);                                // print
        }

        TentamenRepository TentamenRepo = new TentamenRepository();
        List<Tentamen> tentamenList = TentamenRepo.findAllRecords();
        for (Tentamen tentamen : tentamenList) {
            System.out.println(tentamen);
        }

    }


}
