package app.services;

import app.entities.post.Post;
import app.entities.userdata.UserData;

import java.util.List;

/**
 * Created by click on 5/8/2016.
 */
public interface UserService {
    public UserData getUser(String login);
    public void create(UserData userData);
    public void addLikePost(int postId, String userEmail);
    public void removelikePost(int postId, String userEmail);
    public List<Post> getFavoritesPost(String email);
}
