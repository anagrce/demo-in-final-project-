package finalproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="teacher_subject_classroom")
public class TeacherSubjectClassroomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="id")
    private Integer teacherSubjectClassroom_id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH} , fetch = FetchType.EAGER)
    @JoinColumn(name = "grade_id")
    private GradeEntity grade;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "teacherSubject_id")
    private TeacherSubjectEntity teacherSubject;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "classroom_id")
    private ClassroomEntity classroom;

    public TeacherSubjectClassroomEntity(Integer teacherSubjectClassroom_id, GradeEntity grade, TeacherSubjectEntity teacherSubject, ClassroomEntity classroom) {
        this.teacherSubjectClassroom_id = teacherSubjectClassroom_id;
        this.grade = grade;
        this.teacherSubject = teacherSubject;
        this.classroom = classroom;
    }

    /**
     *
     */
    public TeacherSubjectClassroomEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param teacherSubjectClassroom_id
     * @param teacherSubject
     * @param classroom
     */
    public TeacherSubjectClassroomEntity(Integer teacherSubjectClassroom_id, TeacherSubjectEntity teacherSubject,
                                         ClassroomEntity classroom) {
        super();
        this.teacherSubjectClassroom_id = teacherSubjectClassroom_id;
        this.teacherSubject = teacherSubject;
        this.classroom = classroom;
    }

    public Integer getTeacherSubjectClassroom_id() {
        return teacherSubjectClassroom_id;
    }

    public void setTeacherSubjectClassroom_id(Integer teacherSubjectClassroom_id) {
        this.teacherSubjectClassroom_id = teacherSubjectClassroom_id;
    }

    public TeacherSubjectEntity getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(TeacherSubjectEntity teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    public ClassroomEntity getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassroomEntity classroom) {
        this.classroom = classroom;
    }

    public GradeEntity getGrade() {
        return grade;
    }

    public void setGrade(GradeEntity grade) {
        this.grade = grade;
    }
}
