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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name ="students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="student_id")
    private Integer student_id;

    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String jmbg;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn (name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,
            CascadeType.REFRESH })
    protected Set<ClassroomEntity> classroom = new HashSet<ClassroomEntity>();

    public StudentEntity() {
        super();
        // TODO Auto-generated constructor stub
    }



    public StudentEntity(Integer student_id, String name, String lastName, String jmbg,UserEntity user) {
        super();
        this.student_id = student_id;
        this.jmbg = jmbg;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
    }






    public String getJmbg() {
        return jmbg;
    }


    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }


    public Integer getStudent_id() {
        return student_id;
    }


    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public UserEntity getUser() {
        return user;
    }


    public void setUser(UserEntity user) {
        this.user = user;
    }

}
