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

@Entity
@Table(name="classes")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="class_id")
    private Integer class_id;
    @Column
    private Integer number;
    @Column
    private Integer mark;


    @OneToMany(mappedBy = "classid", fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
            CascadeType.REFRESH })
    protected Set<ClassroomEntity> classroom = new HashSet<ClassroomEntity>();



    /**
     *
     */
    public ClassEntity() {
        super();
        // TODO Auto-generated constructor stub
    }



    /**
     * @param class_id
     * @param number
     * @param mark
     * @param classroom
     */
    public ClassEntity(Integer class_id, Integer number, Integer mark, Set<ClassroomEntity> classroom) {
        super();
        this.class_id = class_id;
        this.number = number;
        this.mark = mark;
        this.classroom = classroom;
    }



    public Integer getClass_id() {
        return class_id;
    }



    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }



    public Integer getNumber() {
        return number;
    }



    public void setNumber(Integer number) {
        this.number = number;
    }



    public Integer getMark() {
        return mark;
    }



    public void setMark(Integer mark) {
        this.mark = mark;
    }



    public Set<ClassroomEntity> getClassroom() {
        return classroom;
    }



    public void setClassroom(Set<ClassroomEntity> classroom) {
        this.classroom = classroom;
    }



}



