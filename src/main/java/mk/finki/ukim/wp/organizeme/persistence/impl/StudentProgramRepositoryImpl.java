package mk.finki.ukim.wp.organizeme.persistence.impl;

import mk.finki.ukim.wp.organizeme.model.Student;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.persistence.StudentRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentProgramRepositoryImpl implements StudentRepository {

    private static List<Student> students;

    @PostConstruct
    public void init(){

    }

    @Override
    public List<Student> listAllStudents() {
        return students;
    }

    @Override
    public Student addNew(Student student) throws Exception {
        if(students.stream().map(i->i.index).collect(Collectors.toSet()).contains(student.index)){
            throw new Exception();
        }
        students.add(student);
        return student;
    }

    @Override
    public Student delete(String index) throws Exception {
        Optional<Student> s=students.stream().filter(i->i.index.equals(index)).findFirst();
        if(!s.isPresent()){
            throw new Exception();
        }
        Student rez=s.get();
        students.remove(rez);
        return rez;
    }

    @Override
    public Student update(String index, String name, String lastName, StudyProgram studyProgram) throws Exception {
        Optional<Student> s=students.stream().filter(i->i.index.equals(index)).findFirst();
        if(!s.isPresent()){
            throw new Exception();
        }
        Student rez=s.get();
        if(name.length()>0)
            rez.name=name;
        if(lastName.length()>0)
            rez.lastName=lastName;

        rez.studyProgram=studyProgram;
        students.remove(s.get());
        students.add(rez);
        return rez;

    }
}
