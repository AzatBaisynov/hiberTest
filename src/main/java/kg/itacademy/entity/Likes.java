package kg.itacademy.entity;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
    @ManyToOne
    @JoinColumn(name = "liker_id", nullable = false)
    private Reg_user reg_user;

    public Likes() {
    }

    public Likes(Post post, Reg_user reg_user) {
        this.post = post;
        this.reg_user = reg_user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Reg_user getReg_user() {
        return reg_user;
    }

    public void setReg_user(Reg_user reg_user) {
        this.reg_user = reg_user;
    }

    @Override
    public String toString() {
        return "\nLikes\n" +
                "id= " + id +
                "\npost= " + post +
                "\nreg_user= " + reg_user;
    }
}
