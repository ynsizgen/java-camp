package LoginRegistration.dataAccess.abstracts;

import LoginRegistration.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void register(User user);
    void login(User user);
    User getUser(int id);
    List<User> getAll();
    User getUserByEmail(String email);

}
