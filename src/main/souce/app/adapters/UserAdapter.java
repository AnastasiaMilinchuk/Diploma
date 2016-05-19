package app.adapters;

import app.entities.userdata.UserData;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import java.util.Objects;

/**
 * Created by click on 5/18/2016.
 */
public class UserAdapter {

    public static UserData adapt(UserData userData){
        Object o = new Object();
        userData.setPassword(new ShaPasswordEncoder().encodePassword(userData.getPassword(), o));
        userData.setMatchingPassword(new ShaPasswordEncoder().encodePassword(userData.getMatchingPassword(), o));
        return userData;
    }
}
