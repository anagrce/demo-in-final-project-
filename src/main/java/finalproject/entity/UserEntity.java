package finalproject.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="users")
public class UserEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="user_id")
    private Integer user_id;

    @Column
    private String username;

    @Column(name ="password", nullable = false)
    private String password;

    @Version
    private Integer version;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name ="users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleEntity> roles =new HashSet<>();

    @JsonIgnore
    @OneToOne( fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,
            CascadeType.REFRESH })
    private TeacherEntity teacher;

    @JsonIgnore
    @OneToOne( fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,
            CascadeType.REFRESH })
    private ParentEntity parent;

    @JsonIgnore
    @OneToOne( fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,
            CascadeType.REFRESH })
    private StudentEntity student;

    public UserEntity() {
        super();
    }

    public UserEntity(Integer user_id, String username, String password, Integer version, Set<RoleEntity> roles, AdminEntity adminEntity, TeacherEntity teacher, ParentEntity parent, StudentEntity student) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.version = version;
        this.roles = roles;
        this.teacher = teacher;
        this.parent = parent;
        this.student = student;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
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


