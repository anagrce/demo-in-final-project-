package finalproject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="grades")
public class GradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="grade_id")
    private Integer grade_id;
    @Column(name ="grade", nullable = false)
    @NotNull(message = "Grade must be provided.")
    @Min(value = 1, message = "Grade must be greather than {value}.")
    @Max(value = 5, message = "Grade must be lesser than {value}.")
    private Integer value;
    @Column(name = "date", nullable = false)
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date;

    @OneToMany(mappedBy = "grade", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private Set<TeacherSubjectClassroomEntity> teacherSubjectClassrooms = new HashSet<>();

    @Version
    private Integer version;
    /**
     *
     */
    public GradeEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public GradeEntity(Integer grade_id, @NotNull(message = "Grade must be provided.") @Min(value = 1, message = "Grade must be greather than {value}.") @Max(value = 5, message = "Grade must be lesser than {value}.") Integer value, LocalDate date, Set<TeacherSubjectClassroomEntity> teacherSubjectClassroom, Integer version) {
        this.grade_id = grade_id;
        this.value = value;
        this.date = date;
        this.teacherSubjectClassrooms = teacherSubjectClassrooms;
        this.version = version;
    }



    public Integer getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Integer grade_id) {
        this.grade_id = grade_id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<TeacherSubjectClassroomEntity> getTeacherSubjectClassrooms() {
        return teacherSubjectClassrooms;
    }

    public void setTeacherSubjectClassrooms(Set<TeacherSubjectClassroomEntity> teacherSubjectClassrooms) {
        this.teacherSubjectClassrooms = teacherSubjectClassrooms;
    }
}
