package LoginRegistration.business.abstracts;

import LoginRegistration.entities.concretes.User;

import java.util.List;

public interface ValidationService {
    boolean checkInputs(User user);
    boolean emailIsValid(User user, List<User> users_);
    boolean codeIsEqual(String code);
}
