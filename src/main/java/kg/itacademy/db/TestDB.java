package kg.itacademy.db;

import kg.itacademy.entity.*;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class TestDB {
    public static Reg_user createUser(Reg_user reguser) {
        Session session = kg.util.HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(reguser);
        session.getTransaction().commit();
        session.close();
        return reguser;
    }

    public static Post createPost(Post post) {
        Session session = kg.util.HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(post);
        session.getTransaction().commit();
        session.close();
        return post;
    }

    public static Likes putLike(Likes like) {
        Session session = kg.util.HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(like);
        session.getTransaction().commit();
        session.close();
        return like;
    }

    public static List<ArrayList> getAll(){
        Session session = kg.util.HibernateUtil.getSessionFactory().openSession();
        ArrayList<Reg_user> users = (ArrayList<Reg_user>) session.createQuery("FROM kg.itacademy.entity.Reg_user").list();
        ArrayList<Post> posts = (ArrayList<Post>) session.createQuery("FROM kg.itacademy.entity.Post").list();
        ArrayList<Likes> likes = (ArrayList<Likes>) session.createQuery("FROM kg.itacademy.entity.Likes").list();
        ArrayList<Follower> followers = (ArrayList<Follower>) session.createQuery("FROM kg.itacademy.entity.Follower").list();
        List<ArrayList> list = new ArrayList<>();
        list.add(users);
        list.add(posts);
        list.add(likes);
        list.add(followers);
        session.close();
        return list;
    }

    public static Integer getMostPostedUser(){
//        Session session = kg.util.HibernateUtil.getSessionFactory().openSession();
//        ArrayList<Post> posts = (ArrayList<Post>) session.createQuery("FROM kg.itacademy.entity.Post").list();
//
//        int max = 0;
//        int j = 0;
//        for (int i = 0; i < posts.size(); i++){
//            posts.get(i)
//        }
        return null;
    }

}
