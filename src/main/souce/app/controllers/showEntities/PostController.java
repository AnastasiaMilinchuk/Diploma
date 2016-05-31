package app.controllers.showEntities;

import app.entities.entityActivity.Comment;
import app.services.PostService;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/8/2016.
 */
@Controller
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/article/{id}",method = RequestMethod.GET)
    public String loginPage(@PathVariable("id") int id, Model model){
//        Post post = articleDetailsService.getPostByID(model.getConfig_id());
//        model.addAttribute("post", post);
        model.addAttribute("post", postService.getArticleById(id));
        model.addAttribute("comment", new Comment());
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
        return "article";
    }

    @RequestMapping(value = "/myPosts", method = RequestMethod.GET)
    public String getUsersPosts(Model model){
        model.addAttribute("posts", postService.getPostsByUser(SecurityContextHolder
                        .getContext()
                        .getAuthentication()
                        .getName())
        );

        return "usersPosts";
    }

    @RequestMapping(value = "/article",method = RequestMethod.GET)
    public String redirect(){
        return "home";
    }

    @RequestMapping(value = "/favorites", method = RequestMethod.GET)
    public String getFavoritesPosts(Model model){
        model.addAttribute("posts", userService.getFavoritesPost(SecurityContextHolder
                        .getContext()
                        .getAuthentication()
                        .getName())
        );

        return "favoritePosts";
    }

}

