package mk.finki.ukim.wp.organizeme.persistence.impl;

import mk.finki.ukim.wp.organizeme.model.Student;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.model.exceptions.StudentExistsException;
import mk.finki.ukim.wp.organizeme.persistence.StudentRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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
    public Student addNew(Student student) throws StudentExistsException {
        if(students.stream().map(i->i.index).collect(Collectors.toSet()).contains(student.index)){
            throw new StudentExistsException(student.name);
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

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public List<Student> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Student> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Student> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Student> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Student> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Student> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Student> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Student getOne(String s) {
        return null;
    }

    @Override
    public <S extends Student> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Student> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Student> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Student> boolean exists(Example<S> example) {
        return false;
    }
}
