package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Student;
import sr.unasat.intekenlijst.entities.Tentamen;
import sr.unasat.intekenlijst.entities.Tentamenintekenlijst;
import sr.unasat.intekenlijst.repositories.StudentRepository;
import sr.unasat.intekenlijst.repositories.TentamenIntekenLijstRepository;
import sr.unasat.intekenlijst.repositories.TentamenRepository;

import java.util.List;

public class Application{

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



/*        Persoon person = new Persoon(4);
        persoonRepo.deleteOneRecord(person);*/

//        int pk = persoonRepo.insertOneRecord(new Persoon("Ellen"));

//        ContactInformatieRepository ci = new ContactInformatieRepository();
//        ContactInformatie recordFound = ci.findOneRecord(1234, "Manjastraat 10");
//        System.out.println("single record: " + ci);
//
//        recordFound.setTelefoonNummer(8888);
//        recordFound.getPersoon().setId(4);
//        ci.updateOneRecord(recordFound);
//
//        System.out.println(ci.findAllRecords());


}


/* sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Student;
import sr.unasat.intekenlijst.repositories.StudentRepository;

public class Application {

    public static void main(String[] args) {
        StudentRepository studenRep = new StudentRepository();
        List<Student> studentLis
    }
}

*/