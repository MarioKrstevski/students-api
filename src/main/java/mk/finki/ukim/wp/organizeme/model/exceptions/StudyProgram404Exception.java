package mk.finki.ukim.wp.organizeme.model.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StudyProgram404Exception  extends  Exception {


    @Override
    public String getMessage() {
        return "The study program does not exist";
    }
}
