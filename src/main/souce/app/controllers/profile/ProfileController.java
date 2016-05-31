package app.controllers.profile;

import app.entities.userdata.UserData;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/8/2016.
 */
@Controller
public class ProfileController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "profile", method = RequestMethod.GET)
    public String loginPage(Model model){
        try {
            model.addAttribute("userData", userService.getUser(SecurityContextHolder
                            .getContext()
                            .getAuthentication()
                            .getName()
            ));
        }
        catch (Exception e){

        }
        return "profile";
    }
}
