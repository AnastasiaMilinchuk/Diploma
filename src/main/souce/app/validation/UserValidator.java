package app.validation;

import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by click on 5/22/2016.
 */
public class UserValidator {
    @Autowired
    UserService userService;

    public boolean checkExistEmail(String email){
        if(userService.getUser(email) != null)
            return true;
        return false;
    }
}
