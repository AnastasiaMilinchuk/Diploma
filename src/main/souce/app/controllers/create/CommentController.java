package app.controllers.create;

import app.actions.post.CommentPostAction;
import app.entities.entityActivity.Comment;
import app.entities.userdata.UserData;
import app.services.ArticleService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by click on 5/19/2016.
 */
@Controller
@RequestMapping("/article/{id}/comments")
public class CommentController {
    @Autowired
    CommentPostAction commentPostAction;
    @Autowired
    ArticleService articleService;


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView loadPage(@PathVariable("id") int id){
        return new ModelAndView("article", "post", articleService.getArticleById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView addComment(@PathVariable("id") int id, @ModelAttribute("comment") Comment comment){
        return new ModelAndView("article", "post", commentPostAction.comment(comment, id,
                SecurityContextHolder.getContext().getAuthentication().getName()));
    }
}
