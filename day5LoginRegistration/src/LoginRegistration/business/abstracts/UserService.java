package LoginRegistration.business.abstracts;

import LoginRegistration.entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(User user);
    void login(User user);
    User getUser(int id);
    User getUserByEmail(String email);
    List<User> getAll();
}
