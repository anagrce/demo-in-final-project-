package finalproject.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name ="subjects")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="subject_id")
    private Integer subject_id;
    @Column
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = {
            CascadeType.REFRESH })
    protected Set<TeacherSubjectEntity> teacherSubject = new HashSet<TeacherSubjectEntity>();

    @Version
    private Integer version;

    public SubjectEntity() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param subject_id
     * @param name
     */
    public SubjectEntity(Integer subject_id, String name) {
        super();
        this.subject_id = subject_id;
        this.name = name;
    }
    public Integer getSubject_id() {
        return subject_id;
    }
    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }





}
