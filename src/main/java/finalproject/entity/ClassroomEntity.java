package finalproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="classrooms")
public class ClassroomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="classroom_id")
    private Integer classroom_id;

    @ManyToOne(cascade ={CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "student_id")
    private StudentEntity student;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn (name = "class_id")
    private ClassEntity classid;

    @OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER, cascade = {
            CascadeType.REFRESH, CascadeType.MERGE })
    protected Set<TeacherSubjectClassroomEntity> teacherSubjectClassroom = new HashSet<TeacherSubjectClassroomEntity>();



    /**
     *
     */
    public ClassroomEntity() {
        super();
        // TODO Auto-generated constructor stub
    }



    /**
     * @param classroom_id
     * @param student
     * @param classid
     * @param teacherSubjectClassroom
     */
    public ClassroomEntity(Integer classroom_id, StudentEntity student, ClassEntity classid,
                           Set<TeacherSubjectClassroomEntity> teacherSubjectClassroom) {
        super();
        this.classroom_id = classroom_id;
        this.student = student;
        this.classid = classid;
        this.teacherSubjectClassroom = teacherSubjectClassroom;
    }



    public Integer getClassroom_id() {
        return classroom_id;
    }



    public void setClassroom_id(Integer classroom_id) {
        this.classroom_id = classroom_id;
    }



    public StudentEntity getStudent() {
        return student;
    }



    public void setStudent(StudentEntity student) {
        this.student = student;
    }



    public ClassEntity getClassid() {
        return classid;
    }



    public void setClassid(ClassEntity classid) {
        this.classid = classid;
    }



    public Set<TeacherSubjectClassroomEntity> getTeacherSubjectClassroom() {
        return teacherSubjectClassroom;
    }



    public void setTeacherSubjectClassroom(Set<TeacherSubjectClassroomEntity> teacherSubjectClassroom) {
        this.teacherSubjectClassroom = teacherSubjectClassroom;
    }




}
