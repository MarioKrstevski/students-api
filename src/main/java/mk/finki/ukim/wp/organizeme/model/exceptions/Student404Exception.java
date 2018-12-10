package mk.finki.ukim.wp.organizeme.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class Student404Exception  extends  Exception{

    String index;

    public Student404Exception(String index){
        this.index = index;
    }

    @Override
    public String getMessage() {
        return String.format("Could not find student with index %s", index);
    }
}
