package LoginRegistration.business.concretes;

import LoginRegistration.business.abstracts.AuthService;
import LoginRegistration.business.abstracts.UserService;
import LoginRegistration.entities.concretes.User;

public class AuthManager implements AuthService {

    private UserService userService;

    public AuthManager(UserService userService){
        this.userService=userService;
    }

    @Override
    public void register(User user) {

    }
}
