package mk.finki.ukim.wp.organizeme.persistence.impl;

import mk.finki.ukim.wp.organizeme.model.Student;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.persistence.StudyProgramRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudyProgramRepositoryImpl implements StudyProgramRepository {

    private static List<StudyProgram> studies;

    @PostConstruct
    public void init(){

    }


    @Override
    public List<StudyProgram> listAllStudyPrograms() {
        return studies;
    }

    @Override
    public StudyProgram getStudyProgramByIndex(long index) throws Exception {
        Optional<StudyProgram> sp=studies.stream().filter(i->i.id==index).findFirst();
        if(!sp.isPresent()){
            throw new Exception();
        }
        return sp.get();
    }

    @Override
    public StudyProgram getStudyProgramByName(String name) throws Exception {
        Optional<StudyProgram> sp=studies.stream().filter(i->i.name.equals(name)).findFirst();
        if(!sp.isPresent()){
            throw new Exception();
        }
        return sp.get();
    }

    @Override
    public StudyProgram addNew(StudyProgram studyProgram) throws Exception {
        if(studies.stream().map(i->i.name).collect(Collectors.toSet()).contains(studyProgram.name)){
            throw new Exception();
        }
        studies.add(studyProgram);
        return studyProgram;
    }

    @Override
    public StudyProgram delete(long index) throws Exception {
        Optional<StudyProgram> s=studies.stream().filter(i->i.id==index).findFirst();
        if(!s.isPresent()){
            throw new Exception();
        }
        StudyProgram rez=s.get();
        studies.remove(rez);
        return rez;
    }

    @Override
    public StudyProgram deleteByName(String name) throws Exception {
        Optional<StudyProgram> s=studies.stream().filter(i->i.name.equals(name)).findFirst();
        if(!s.isPresent()){
            throw new Exception();
        }
        StudyProgram rez=s.get();
        studies.remove(rez);
        return rez;
    }

    @Override
    public StudyProgram update(String oldName, String newName) throws Exception {
        Optional<StudyProgram> s=studies.stream().filter(i->i.name.equals(oldName)).findFirst();
        if(!s.isPresent()){
            throw new Exception();
        }
        StudyProgram rez=s.get();
        studies.remove(rez);
        rez.name=newName;
        studies.add(rez);
        return rez;
    }

    @Override
    public List<StudyProgram> findAll() {
        return studies;
    }

    @Override
    public List<StudyProgram> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<StudyProgram> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<StudyProgram> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(StudyProgram entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends StudyProgram> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends StudyProgram> S save(S entity) {
        return null;
    }

    @Override
    public <S extends StudyProgram> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<StudyProgram> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends StudyProgram> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<StudyProgram> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public StudyProgram getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends StudyProgram> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends StudyProgram> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends StudyProgram> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends StudyProgram> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends StudyProgram> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends StudyProgram> boolean exists(Example<S> example) {
        return false;
    }
}
