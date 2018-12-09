package mk.finki.ukim.wp.organizeme.persistence;

import mk.finki.ukim.wp.organizeme.model.Student;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.model.exceptions.StudentDuplicateException;

import java.util.List;

public interface StudentRepository {
    List<Student> listAllStudents();
    Student addNew(Student student) throws StudentDuplicateException, Exception;
    Student delete(String index) throws Exception;
    Student update(String index, String name, String lastName, StudyProgram studyProgram) throws Exception;

}
