package kg.itacademy.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "post_name")
    private String post_name;
    @ManyToOne
    @JoinColumn(name = "reg_user_id", nullable = false, unique = true)
    private Reg_user reg_user;

    public Post() {
    }

    public Post(String post_name, Reg_user reg_user) {
        this.post_name = post_name;
        this.reg_user = reg_user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public Reg_user getReg_user() {
        return reg_user;
    }

    public void setReg_user(Reg_user reg_user) {
        this.reg_user = reg_user;
    }

    @Override
    public String toString() {
        return "\nPost\n" +
                "id= " + id +
                "\npost_name= " + post_name +
                "\nreg_user= " + reg_user;
    }
}
