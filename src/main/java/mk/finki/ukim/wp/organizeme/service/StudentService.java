package mk.finki.ukim.wp.organizeme.service;

import antlr.collections.AST;
import mk.finki.ukim.wp.organizeme.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentsById(int studentId);
    List<Student> getStudentsByProgramId(int programId);
    Student createStudent(String index, String name, String lastName, String studyProgramName);
    Student updateStudent(String index, String name, String lastName, String studyProgramName);
    Student deleteStudent(int index);

}
