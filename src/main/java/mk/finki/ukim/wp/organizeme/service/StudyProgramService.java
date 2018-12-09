package mk.finki.ukim.wp.organizeme.service;

import mk.finki.ukim.wp.organizeme.model.StudyProgram;

import java.util.List;

public interface StudyProgramService {
    List<StudyProgram> getStudyPrograms();
    StudyProgram createStudyProgram(String name);
    StudyProgram deleteStudyProgram(int studyProgramId);
}
