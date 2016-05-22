package app.controllers.showEntities;

import app.services.ArticleService;
import app.services.PostService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by click on 5/8/2016.
 */
@Controller
@RequestMapping(value = {"/", "/home"})
public class HomePageController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public String homePageController(Model model){
        // get from service
        model.addAttribute("posts", articleService.getArticlesList());
        return "home";

    }
}
