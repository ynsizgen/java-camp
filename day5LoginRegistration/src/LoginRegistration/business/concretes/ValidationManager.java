package LoginRegistration.business.concretes;

import LoginRegistration.business.abstracts.ValidationService;
import LoginRegistration.dataAccess.abstracts.UserDao;
import LoginRegistration.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationManager implements ValidationService {

    private UserDao userDao;

    public ValidationManager(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public boolean checkInputs(User user) {
        if(user.getFirstName().length()>1 && user.getLastName().length()>1 && user.getPassword().length()>5) {
            return true;
        }else {
            System.out.println("Ad en az 2 karakterden oluşmalıdır!");
            System.out.println("Soyad en az 2 karakterden oluşmalıdır!");
            System.out.println("Parola en az 6 karakterden oluşmalıdır!");
            return false;
        }
    }
    private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

    public boolean emailIsValid(User user, List<User> users_){

        Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getEmail());


        if(pattern.matcher(user.getEmail()).find()) {
            for (User user_ : users_) {
                if(user_.getEmail().equals(user.getEmail())) {
                    System.out.println("Mail Is Already Exist! Kayit Yapilamadi!!!!!!!!!!!!!");
                    return false;
                }
            }
            return true;
        }
        System.out.println("Format doğru değil. Kayit Yapilamadi!!!!!!!!!!!!!");
        return false;

    }

    String confirmCode="1";
    @Override
    public boolean codeIsEqual(String code) {
        if(confirmCode.equals(code)) {
            System.out.println("Başarılı... ");
            return true;
        }else {
            return false;
        }
    }
}
