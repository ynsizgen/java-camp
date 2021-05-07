package LoginRegistration.business.concretes;

import LoginRegistration.business.abstracts.UserService;
import LoginRegistration.business.abstracts.ValidationService;
import LoginRegistration.dataAccess.abstracts.UserDao;
import LoginRegistration.entities.concretes.User;


import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserManager implements UserService{


    private UserDao userDao;
    private ValidationService validationService;

    public UserManager(UserDao userDao,ValidationService validationService){
        this.userDao=userDao;
        this.validationService=validationService;

    }

    @Override
    public void register(User user) {

       if(this.validationService.checkInputs(user) && this.validationService.emailIsValid(user,this.getAll()) ){
            System.out.println("Lutfen mail adresinize gonderilen kodu giriniz, code: 1");

            Scanner confirmMail_ = new Scanner(System.in);
            String cm = confirmMail_.next();
            if(validationService.codeIsEqual(cm)) {
                userDao.register(user);

            }else {
                System.out.println("Onay kodunu yanlis girdiniz. Tekrar üye olun.");
            }
        }

    }

    @Override
    public void login(User user) {
        userDao.login(user);
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}



