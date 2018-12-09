package mk.finki.ukim.wp.organizeme.persistence;

import mk.finki.ukim.wp.organizeme.model.StudyProgram;

import java.util.List;

public interface StudyProgramRepository {
    List<StudyProgram> listAllStudyPrograms();

    StudyProgram getStudyProgramByIndex(long index) throws Exception;

    StudyProgram getStudyProgramByName(String name) throws Exception;

    StudyProgram addNew(StudyProgram studyProgram) throws Exception;

    StudyProgram delete(long index) throws Exception;

    StudyProgram deleteByName(String name) throws Exception;

    StudyProgram update(String oldName,String newName) throws Exception;
}
