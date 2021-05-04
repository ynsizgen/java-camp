package Service;

import Model.User;

public interface IUserCheckService {
    boolean checkIfRealPerson(User user);
}
