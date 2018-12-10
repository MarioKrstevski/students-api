package mk.finki.ukim.wp.organizeme.persistence;

import mk.finki.ukim.wp.organizeme.model.Student;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.model.exceptions.StudentExistsException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    List<Student> listAllStudents();
    Student addNew(Student student) throws StudentExistsException;
    Student delete(String index) throws Exception;
    Student update(String index, String name, String lastName, StudyProgram studyProgram) throws Exception;

}
