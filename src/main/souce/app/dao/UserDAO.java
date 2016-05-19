package app.dao;

import app.entities.userdata.User;
import app.entities.userdata.UserData;

/**
 * Created by click on 5/18/2016.
 */
public interface UserDAO {
    public void create(UserData userData);
    public User readByID(int id);
    public User readByEmail(String email);
    public void update(User user);
    public void delete(User user);

}
