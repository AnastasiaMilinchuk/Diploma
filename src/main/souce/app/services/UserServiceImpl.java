package app.services;

import app.dao.UserDAO;
import app.entities.userdata.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by click on 5/16/2016.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

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


}