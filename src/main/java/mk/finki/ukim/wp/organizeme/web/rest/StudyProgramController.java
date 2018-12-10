package mk.finki.ukim.wp.organizeme.web.rest;

import mk.finki.ukim.wp.organizeme.model.RawStudyProgram;
import mk.finki.ukim.wp.organizeme.model.StudyProgram;
import mk.finki.ukim.wp.organizeme.model.exceptions.StudyProgram404Exception;
import mk.finki.ukim.wp.organizeme.service.impl.StudyProgramServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/study_programs")
    public class StudyProgramController {


        private StudyProgramServiceImpl studyProgramServiceImpl;

        @Autowired
        public StudyProgramController (StudyProgramServiceImpl studyProgramServiceImpl) {
            this.studyProgramServiceImpl= studyProgramServiceImpl;
        }

        @GetMapping
        public List<StudyProgram> getStudyProgram() {
            return studyProgramServiceImpl.getStudyPrograms();
        }


        @PostMapping
        public StudyProgram addStudyProgram(@RequestBody RawStudyProgram rawStudyProgram) {
            return studyProgramServiceImpl.createStudyProgram(rawStudyProgram);
        }

        @DeleteMapping("/{index}")
        public void deleteStudentProgram(@PathVariable("index") Long index) throws StudyProgram404Exception {
            studyProgramServiceImpl.deleteStudyProgram(index);
        }
    }

