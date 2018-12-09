package mk.finki.ukim.wp.organizeme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    public String index;

    @Column(name = "name")
    public String name;

    @Column(name = "lastName")
    public String lastName;

    @ManyToOne
    @JoinColumn(name = "study_program_id")
    @JsonIgnore
    public StudyProgram studyProgram;
}
