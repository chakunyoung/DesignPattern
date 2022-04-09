package singleton;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1();
        User2 user2 = new User2();

        if(user1.getOne().equals(user2.getOne())){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
