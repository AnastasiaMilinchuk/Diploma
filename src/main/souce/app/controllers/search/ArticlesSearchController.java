package app.controllers.search;

import app.entities.post.Head;
import app.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Struct;

/**
 * Created by click on 5/8/2016.
 */
@Controller
public class ArticlesSearchController {
    @Autowired
    PostService postService;

    @RequestMapping(value = "recent", method = RequestMethod.GET)
    public String recentPage(Model model){
        // get from service
        model.addAttribute("posts", postService.getRecentPosts());
        model.addAttribute("heading", Head.RECENT);
        return "home";
    }

    @RequestMapping(value = "mostPopular", method = RequestMethod.GET)
    public String mostPopularPage(Model model){
        // get from service
        model.addAttribute("posts", postService.getMostPopularPosts());
        model.addAttribute("heading", Head.MOSTPOPULAR);
        return "home";
    }

    @RequestMapping(value = "recommended", method = RequestMethod.GET)
    public String recommendedPage(Model model){
        // get from service
        try {
            model.addAttribute("posts", postService.getRecommendedPost(SecurityContextHolder.
                    getContext().getAuthentication().getName()));
            model.addAttribute("heading", Head.RECOMMENDED);
        }
        catch (Exception e){
            model.addAttribute("posts", postService.getMostPopularPosts());
            model.addAttribute("heading", Head.MOSTPOPULAR);
        }
        return "home";
    }
}
