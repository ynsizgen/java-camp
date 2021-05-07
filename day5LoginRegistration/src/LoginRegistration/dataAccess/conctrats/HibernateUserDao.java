package LoginRegistration.dataAccess.conctrats;

import LoginRegistration.dataAccess.abstracts.UserDao;
import LoginRegistration.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users = new ArrayList<>();

    @Override
    public void register(User user) {
        users.add(user);
        System.out.println("Sisteme kayıt olundu. "+ user);
    }

    @Override
    public void login(User user) {

    }

    @Override
    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        System.out.println("Kullanıcı bulunamadı.");
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
