package mk.finki.ukim.wp.organizeme.model;

import javax.persistence.*;

@Entity
@Table(name = "study_program")
public class StudyProgram {

    @Column(name = "name")
    public String name;

    @Id
    @GeneratedValue
    public Long id;
}
