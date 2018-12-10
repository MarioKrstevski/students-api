package mk.finki.ukim.wp.organizeme.service.impl;

import mk.finki.ukim.wp.organizeme.model.RawStudyProgram;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.model.exceptions.StudyProgram404Exception;
import mk.finki.ukim.wp.organizeme.persistence.StudyProgramRepository;
import mk.finki.ukim.wp.organizeme.service.StudyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyProgramServiceImpl implements StudyProgramService {

    @Autowired
    private StudyProgramRepository studyProgramRepository;

    @Override
    public List<StudyProgram> getStudyPrograms() {
        return null;
    }

    @Override
    public StudyProgram createStudyProgram(String name) {
        return null;
    }

    @Override
    public void deleteStudyProgram(int studyProgramId) {
        if (!studyProgramRepository.existsById(id))
            throw new StudyProgram404Exception();
        studyProgramRepository.deleteById(id);
    }
}
