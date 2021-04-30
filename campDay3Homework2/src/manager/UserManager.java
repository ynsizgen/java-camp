package manager;

import model.User;

public class UserManager {

    public void add(User user){
        System.out.println(user.getFirstName()+" "+"added" );
    }
    public void update(User user){
        System.out.println(user.getFirstName()+" "+"updated" );
    }
}
