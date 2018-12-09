package mk.finki.ukim.wp.organizeme.persistence.impl;

import mk.finki.ukim.wp.organizeme.model.Student;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.persistence.StudyProgramRepository;

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
}
