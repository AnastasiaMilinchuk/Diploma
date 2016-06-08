package app.controllers.showEntities;

import app.entities.post.Head;
import app.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by click on 5/8/2016.
 */
@Controller
public class HomePageController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String homePage(Model model){
        // get from service
        model.addAttribute("posts", postService.getArticlesList());
        model.addAttribute("heading", Head.RECENT);
        return "home";
    }

}
