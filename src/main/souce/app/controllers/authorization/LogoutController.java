package app.controllers.authorization;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/17/2016.
 */
@Controller
@RequestMapping("/logout")
public class LogoutController {
    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(Model model){
        return "login";
    }

}