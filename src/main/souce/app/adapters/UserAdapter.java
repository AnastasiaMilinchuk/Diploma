package app.adapters;

import app.entities.userdata.UserData;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;

/**
 * Created by click on 5/18/2016.
 */
public class UserAdapter {

    public static UserData adapt(UserData userData){
        userData.setPassword(new BCryptPasswordEncoder().encode(userData.getPassword()));
        userData.setMatchingPassword(new BCryptPasswordEncoder().encode(userData.getMatchingPassword()));
        return userData;
    }
}
