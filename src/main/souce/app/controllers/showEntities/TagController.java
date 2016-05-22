package app.controllers.showEntities;

import app.entities.post.Article;
import app.entities.post.Post;
import app.services.ArticleService;
import app.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by click on 5/19/2016.
 */
@Controller
public class TagController {
    @Autowired
    TagService tagService;

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/tags",method = RequestMethod.GET)
    public String loginPage( Model model){
//        Post post = articleDetailsService.getPostByID(model.getConfig_id());
//        model.addAttribute("post", post);
        model.addAttribute("tags", tagService.getAllTags());
        return "tags";
    }

    @RequestMapping(value = "/tags/{tag}", method = RequestMethod.GET)
    public String articlesByTag(@PathVariable("tag") int tag, Model model) {
        List<Post> posts = articleService.getArticlesByTag(tag);
        model.addAttribute("posts", posts);
        return "home";
    }
}