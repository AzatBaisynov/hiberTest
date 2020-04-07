package kg.itacademy.entity;

import javax.persistence.*;

@Entity
@Table(name = "follower")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "main_id", nullable = false)
    private Reg_user reg_user_main;
    @OneToOne
    @JoinColumn(name = "follower_id", nullable = false)
    private Reg_user reg_user_follower;

    public Follower() {
    }

    public Follower(Reg_user reg_user_main, Reg_user reg_user_follower) {
        this.reg_user_main = reg_user_main;
        this.reg_user_follower = reg_user_follower;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Reg_user getReg_user_main() {
        return reg_user_main;
    }

    public void setReg_user_main(Reg_user reg_user_main) {
        this.reg_user_main = reg_user_main;
    }

    public Reg_user getReg_user_follower() {
        return reg_user_follower;
    }

    public void setReg_user_follower(Reg_user reg_user_follower) {
        this.reg_user_follower = reg_user_follower;
    }

    @Override
    public String toString() {
        return "\nFollower\n" +
                "\nid= " + id +
                "\nreg_user_main= " + reg_user_main +
                "\nreg_user_follower= " + reg_user_follower;
    }
}
