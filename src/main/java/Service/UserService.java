package Service;

import DataBase.UserStore;
import models.User;

public class UserService {
    private final Userstore store = new UserStore();

    public User CreateUser(User user){
        User newUser = new User( user.getUsername(),
                user.getEmail(), user.getPassword(), user.getRole());
        return store.save(newUser);
    }
    public List<User> GetAllusers(){
        return
    }

}
