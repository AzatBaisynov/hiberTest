package kg.itacademy;

import kg.itacademy.db.TestDB;
import kg.itacademy.entity.*;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        //ЗАДАЧА А

        Reg_user user1 = new Reg_user("Azat", 23);
        Reg_user user2 = new Reg_user("Shamil", 22);
        Reg_user user3 = new Reg_user("Jarkynai", 17);
        Reg_user user4 = new Reg_user("Anara", 17);
        Reg_user user5 = new Reg_user("Bagdash", 20);

        TestDB.createUser(user1);
        TestDB.createUser(user2);
        TestDB.createUser(user3);
        TestDB.createUser(user4);
        TestDB.createUser(user5);

        Post post1 = new Post("firstPost", user1);
        Post post2 = new Post("secondPost", user1);
        Post post3 = new Post("thirdPost", user1);

        Post post4 = new Post("fourthPost", user2);
        Post post5 = new Post("fifthPost", user2);
        Post post6 = new Post("sixPost", user2);

        Post post7 = new Post("seventPost", user3);
        Post post8 = new Post("eightPost", user3);
        Post post9 = new Post("ninePost", user3);

        Post post10 = new Post("tenPost", user4);
        Post post11 = new Post("elevenPost", user4);
        Post post12 = new Post("twelvePost", user4);
        Post post13 = new Post("thirteenPost", user4);

        Post post14 = new Post("firstPost", user5);
        Post post15 = new Post("firstPost", user5);

        TestDB.createPost(post1);
        TestDB.createPost(post2);
        TestDB.createPost(post3);
        TestDB.createPost(post4);
        TestDB.createPost(post5);
        TestDB.createPost(post6);
        TestDB.createPost(post7);
        TestDB.createPost(post8);
        TestDB.createPost(post9);
        TestDB.createPost(post10);
        TestDB.createPost(post11);
        TestDB.createPost(post12);
        TestDB.createPost(post13);
        TestDB.createPost(post14);
        TestDB.createPost(post15);

        Likes like1 = new Likes(post1, user2);
        Likes like2 = new Likes(post1, user3);

        Likes like3 = new Likes(post2, user2);

        Likes like4 = new Likes(post3, user2);

        Likes like5 = new Likes(post4, user1);
        Likes like6 = new Likes(post5, user1);
        Likes like7 = new Likes(post6, user1);

        Likes like8 = new Likes(post7, user2);
        Likes like9 = new Likes(post8, user2);
        Likes like10 = new Likes(post9, user2);

        Likes like11 = new Likes(post10, user1);
        Likes like12 = new Likes(post10, user2);
        Likes like13 = new Likes(post10, user3);
        Likes like14 = new Likes(post10, user5);

        Likes like15 = new Likes(post11, user2);
        Likes like16 = new Likes(post12, user2);
        Likes like17 = new Likes(post13, user2);

        Likes like18 = new Likes(post14, user1);
        Likes like19 = new Likes(post14, user2);

        Likes like20 = new Likes(post15, user4);

        TestDB.putLike(like1);
        TestDB.putLike(like2);
        TestDB.putLike(like3);
        TestDB.putLike(like4);
        TestDB.putLike(like5);
        TestDB.putLike(like6);
        TestDB.putLike(like7);
        TestDB.putLike(like8);
        TestDB.putLike(like9);
        TestDB.putLike(like10);
        TestDB.putLike(like11);
        TestDB.putLike(like12);
        TestDB.putLike(like13);
        TestDB.putLike(like14);
        TestDB.putLike(like15);
        TestDB.putLike(like16);
        TestDB.putLike(like17);
        TestDB.putLike(like18);
        TestDB.putLike(like19);
        TestDB.putLike(like20);


        //ЗАДАЧА Б
        List<ArrayList> list = TestDB.getAll();
        List<Reg_user> userList = list.get(0);
        List<Post> postsList = list.get(1);
        List<Likes> likesList = list.get(2);
        List<Follower> followers = list.get(3);

        userList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        userList.forEach(x -> System.out.println(x));
        postsList.forEach(x -> System.out.println(x));
        likesList.forEach(x -> System.out.println(x));
        followers.forEach(x -> System.out.println(x));


    }
}
