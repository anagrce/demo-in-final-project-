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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name ="teacher_subject")
public class TeacherSubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="teacherSubject_id")
    private Integer teacherSubject_id;
    @Column
    private Integer weekFond;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "teacher_id")
    private TeacherEntity teacher;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "subject_id")
    private SubjectEntity subject;

    @Version
    private Integer version;

    @OneToMany(mappedBy = "teacherSubject", fetch = FetchType.LAZY, cascade = {
            CascadeType.REFRESH })
    protected Set<TeacherSubjectClassroomEntity> teacherSubjectClassroom = new HashSet<TeacherSubjectClassroomEntity>();

    /*
     *
     */
    public TeacherSubjectEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param teacherSubject_id
     * @param weekFond
     * @param teacher
     * @param subject
     */
    public TeacherSubjectEntity(Integer teacherSubject_id, Integer weekFond, TeacherEntity teacher,
                                SubjectEntity subject) {
        super();
        this.teacherSubject_id = teacherSubject_id;
        this.weekFond = weekFond;
        this.teacher = teacher;
        this.subject = subject;
    }

    public Integer getTeacherSubject_id() {
        return teacherSubject_id;
    }

    public void setTeacherSubject_id(Integer teacherSubject_id) {
        this.teacherSubject_id = teacherSubject_id;
    }

    public Integer getWeekFond() {
        return weekFond;
    }

    public void setWeekFond(Integer weekFond) {
        this.weekFond = weekFond;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public SubjectEntity getSubject() {
        return subject;
    }

    public void setSubject(SubjectEntity subject) {
        this.subject = subject;
    }


}
