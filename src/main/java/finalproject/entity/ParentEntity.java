package finalproject.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name ="parents")
public class ParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="parent_id")
    private Integer parent_id;

    @Column(nullable = false)
    @NotBlank(message = "First name must be provided.")
    @Size (min = 2, max = 30, message = "First name must be between {min} and {max} characters long.")
    private String name;

    @Column(nullable = false)
    @NotBlank(message = "Last name must be provided.")
    @Size (min = 2, max = 30, message = "Last name must be between {min} and {max} characters long.")
    private String lastName;

    @Column(nullable = false, unique = true)
    //@NotNull(message = "Email must be provided.")
    //@Email(message = "Email is not valid.")
    private String email;

    @Version
    private Integer version;

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn (name = "user_id")
    private UserEntity user;

    /**
     *
     */
    public ParentEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param parent_id
     * @param name
     * @param lastName
     * @param email
     * @param version
     * @param user
     */
    public ParentEntity(Integer parent_id, String name, String lastName, String email, Integer version,
                        UserEntity user) {
        super();
        this.parent_id = parent_id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.version = version;
        this.user = user;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

