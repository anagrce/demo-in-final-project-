package finalproject.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name ="parent_student")
public class ParentStudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="id")
    private Integer parentStudent_id;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn (name = "parent_id")
    private ParentEntity parent;



    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn (name = "student_id")
    private StudentEntity student;



    /**
     *
     */
    public ParentStudentEntity() {
        super();
        // TODO Auto-generated constructor stub
    }



    /**
     * @param parentStudent_id
     * @param parent
     * @param student
     */
    public ParentStudentEntity(Integer parentStudent_id, ParentEntity parent, StudentEntity student) {
        super();
        this.parentStudent_id = parentStudent_id;
        this.parent = parent;
        this.student = student;
    }



    public Integer getParentStudent_id() {
        return parentStudent_id;
    }



    public void setParentStudent_id(Integer parentStudent_id) {
        this.parentStudent_id = parentStudent_id;
    }



    public ParentEntity getParent() {
        return parent;
    }



    public void setParent(ParentEntity parent) {
        this.parent = parent;
    }



    public StudentEntity getStudent() {
        return student;
    }



    public void setStudent(StudentEntity student) {
        this.student = student;
    }



}


