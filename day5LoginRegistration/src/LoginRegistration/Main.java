package LoginRegistration;

import LoginRegistration.business.abstracts.UserService;
import LoginRegistration.business.concretes.UserManager;
import LoginRegistration.business.concretes.ValidationManager;
import LoginRegistration.dataAccess.abstracts.UserDao;
import LoginRegistration.dataAccess.conctrats.HibernateUserDao;
import LoginRegistration.entities.concretes.User;



public class Main {
    public static void main(String[] args){

        UserDao userdao=new HibernateUserDao();

        UserService userService = new UserManager(new HibernateUserDao(),new ValidationManager(userdao));

        System.out.println("----------Kullancı üye oluyor.------------");
        User user1 = new User(100,"Yunus","Ün","yns@gmail.com","123456");
        userService.register(user1);
        System.out.println("");

        System.out.println("----------Kullancı üye oluyor.------------");
        User user2 = new User(101,"Ahmet","Kural","ahmet@gmail.com","123456");
        userService.register(user2);
        System.out.println("");

        System.out.println("----------Kullancı üye oluyor.------------");
        User user3 = new User(102,"Mehmet","Ünlü","mehmet@gmail.com","123456");
        userService.register(user3);
        System.out.println("");

        System.out.println("----------Kullancı üye oluyor.------------");
        User user4 = new User(103,"Ali","Veli" ,"ali@gmail.com","123456");
        userService.register(user4);
        System.out.println("");


        System.out.println("----------Id ile kullancı aranıyor.------------");
        System.out.println(userService.getUser(101));
        System.out.println("");

        System.out.println("----------Tüm kullanıcıları göster üye oluyor.------------");
        for (User user:userService.getAll()) {
            System.out.println(user);
        }
        System.out.println("");
    }

}
