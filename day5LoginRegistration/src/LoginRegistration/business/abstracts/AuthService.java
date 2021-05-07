package LoginRegistration.business.abstracts;

import LoginRegistration.entities.concretes.User;

public interface AuthService {
    void register(User user);
}
