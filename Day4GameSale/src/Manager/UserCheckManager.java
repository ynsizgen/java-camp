package Manager;

import Model.User;
import Service.IUserCheckService;

public class UserCheckManager implements IUserCheckService {
    public UserCheckManager() {
    }

    public boolean checkIfRealPerson(User user) {
        int nationalityNumberLength = user.getNationalityId().length();
        return nationalityNumberLength == 11;
    }
}
