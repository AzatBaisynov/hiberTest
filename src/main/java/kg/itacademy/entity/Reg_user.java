package kg.itacademy.entity;

import javax.persistence.*;

@Entity
@Table(name = "reg_user")
public class Reg_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private Integer age;

    public Reg_user() {
    }

    public Reg_user(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nuser\n" +
                "id= " + id +
                "\nname= " + name +
                "\nage= " + age +
                '\n';
    }
}
