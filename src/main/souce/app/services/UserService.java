package app.services;

import app.entities.userdata.UserData;

/**
 * Created by click on 5/8/2016.
 */
public interface UserService {
    UserData getUser(String login);
    void create(UserData userData);
    void addLikePost(int postId, String userEmail);
    void removelikePost(int postId, String userEmail);
}
