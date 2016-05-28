package app.dao;

import app.entities.userdata.User;
import app.entities.userdata.UserData;

/**
 * Created by click on 5/18/2016.
 */
public interface UserDAO {
    public void create(UserData userData);
    public UserData readByID(int id);
    public UserData readByEmail(String email);
    void update(UserData user);
    void delete(UserData user);

    void addLikePost(int postId, String userEmail);
    void removeLikePost(int postId, String userEmail);
}
