package sr.unasat.intekenlijst.app;

import sr.unasat.intekenlijst.entities.Student;
import sr.unasat.intekenlijst.repositories.StudentRepository;

import java.util.List;


public class DeleteStudent {

    public static void main(String[] args) {

        StudentRepository studentRepo = new StudentRepository();
        List<Student> studentList = studentRepo.findAllRecords();
        for (Student student : studentList) {

            Student student1 = new Student(1);
            studentRepo.deleteOneRecord(student1);

        }

    }
}
