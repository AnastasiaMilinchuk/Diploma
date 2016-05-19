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
        UserData user = new UserData();
        user.setEmail(email);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");
        //UserData userData = userDAO.readByEmail(email);
        return user;
    }

    @Override
    public void create(UserData userData) {
        userDAO.create(userData);
    }

    @Override
    public void addLikePost(int postId, String userEmail) {

    }

    @Override
    public void removelikePost(int postId, String userEmail) {

    }


}