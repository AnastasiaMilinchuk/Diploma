package app.controllers.actions;

import app.actions.post.LikePostAction;
import app.entities.entityActivity.Comment;
import app.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/31/2016.
 */
@Controller
public class LikePostController {
    @Autowired
    PostService postService;

    @Autowired
    LikePostAction likePostAction;

    @RequestMapping(value = "/article/{id}/like", method = RequestMethod.POST)
    public String likeArticle(@PathVariable("id") int id, Model model){
        likePostAction.like(id, SecurityContextHolder.getContext().getAuthentication().getName());
        System.out.println("name: " + SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("post", postService.getArticleById(id));
        model.addAttribute("comment", new Comment());
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
        return "article";
    }

    @RequestMapping(value = "/article/{id}/like", method = RequestMethod.GET)
    public String loaglikeArticle(@PathVariable("id") int id, Model model) {
        model.addAttribute("post", postService.getArticleById(id));
        model.addAttribute("comment", new Comment());
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
        return "article";
    }
}
