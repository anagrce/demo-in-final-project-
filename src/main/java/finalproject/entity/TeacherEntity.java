package finalproject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table(name ="teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="teacher_id")
    private Integer teacher_id;

    @Column(name = "first_name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Version
    private Integer version;

    @OneToOne( fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,
            CascadeType.REFRESH })
    @JoinColumn (name = "user_id")
    private UserEntity user;

    /**
     *
     */
    public TeacherEntity() {
        super();

    }

    /**
     * @param teacher_id
     * @param name
     * @param lastName
     * @param version
     * @param user
     */
    public TeacherEntity(Integer teacher_id, String name, String lastName, Integer version, UserEntity user) {
        super();
        this.teacher_id = teacher_id;
        this.name = name;
        this.lastName = lastName;
        this.version = version;
        this.user = user;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

}
