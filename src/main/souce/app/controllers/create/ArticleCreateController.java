package app.controllers.create;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/16/2016.
 */
@Controller
public class ArticleCreateController {
    @RequestMapping(value = "createPost", method = RequestMethod.GET)
    public String loadPage(Model model){
        return "createPost";
    }
}
