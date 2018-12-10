package mk.finki.ukim.wp.organizeme.persistence;

import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudyProgramRepository  extends JpaRepository<StudyProgram, Long> {
    List<StudyProgram> listAllStudyPrograms();

    StudyProgram getStudyProgramByIndex(long index) throws Exception;

    StudyProgram getStudyProgramByName(String name) throws Exception;

    StudyProgram addNew(StudyProgram studyProgram) throws Exception;

    StudyProgram delete(long index) throws Exception;

    StudyProgram deleteByName(String name) throws Exception;

    StudyProgram update(String oldName,String newName) throws Exception;
}
