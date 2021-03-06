package mk.finki.ukim.wp.organizeme.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StudentExistsException extends Exception{
    String index;

    public StudentExistsException(String index){ this.index = index;}

    @Override
    public String getMessage(){
        return String.format("Student with index %s already exists!", index);
    }


}
