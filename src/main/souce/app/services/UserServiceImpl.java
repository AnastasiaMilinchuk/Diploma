package app.services;

import app.dao.PostDAO;
import app.dao.UserDAO;
import app.entities.post.Post;
import app.entities.userdata.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 5/16/2016.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Autowired
    PostDAO postDAO;

    @Override
    public UserData getUser(String email) {
        return userDAO.readByEmail(email);
    }

    @Override
    public void create(UserData userData) {
        userDAO.create(userData);
    }

    @Override
    public void addLikePost(int postId, String userEmail) {
        userDAO.addLikePost(postId, userEmail);
    }

    @Override
    public void removelikePost(int postId, String userEmail) {
        userDAO.removeLikePost(postId, userEmail);
    }

    @Override
    public List<Post> getFavoritesPost(String email) {
        UserData userData = userDAO.readByEmail(email);
        List<Post> posts = new ArrayList<>();
        for(int id: userData.getLikePosts()){
            posts.add(postDAO.getPostById(id));
        }
        return posts;
    }


}