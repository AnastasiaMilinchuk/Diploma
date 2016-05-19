package app.controllers.authorization;

import app.adapters.UserAdapter;
import app.entities.userdata.User;
import app.entities.userdata.UserData;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by click on 5/8/2016.
 */
@Controller
@RequestMapping("signup")
public class SignUpController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(Model model){
        UserData userData = new UserData();
        model.addAttribute(userData);
        return "signup";
    }


    @Autowired
    UserService userService;

    @Autowired
    UserDetailsService userDetailsService;


    @RequestMapping( method = RequestMethod.POST)
    public ModelAndView registerUserAccount(@ModelAttribute("userData") @Valid UserData userData,
                                            BindingResult result, Errors errors) {

        // check errors
        // adapt password
        // save user

        if(result.hasErrors()){
            userData.setPassword("");
            userData.setMatchingPassword("");
            return new ModelAndView("signup", "user", userData);
        }
        else {
            // adapt password
            userData = UserAdapter.adapt(userData);
            // save user
            userService.create(userData);
            // register user in spring session
            UserDetails registeredUser = userDetailsService.loadUserByUsername(userData.getEmail());
            SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(registeredUser,
                    new Object(),
                    registeredUser.getAuthorities()));
            return new ModelAndView("home", "user", userData);
        }

    }
}