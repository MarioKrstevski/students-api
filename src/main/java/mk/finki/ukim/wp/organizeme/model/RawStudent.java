package mk.finki.ukim.wp.organizeme.model;

public class RawStudent {
    public  String index;
    public String name;
    public String lastName;

    private  String studyProgramName;

    public void setIndex(String index){
        this.index = index;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setStudyProgramName(String studyProgramName){
        this.studyProgramName = studyProgramName;
    }

    public String getIndex(){
        return index;
    }
    public String getName(){
        return name;
    }

    public String getLastName(){
        return  lastName;
    }
    public String getStudyProgramName(){
        return studyProgramName;
    }
}
