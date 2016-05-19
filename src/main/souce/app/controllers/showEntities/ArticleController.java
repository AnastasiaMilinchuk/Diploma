package app.controllers.showEntities;

import app.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/8/2016.
 */
@Controller
@RequestMapping("/article/{id}")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(@PathVariable("id") int id, Model model){
//        Post post = articleDetailsService.getPostByID(model.getId());
//        model.addAttribute("post", post);
        model.addAttribute("post", articleService.getArticleById(id));
        return "article";
    }
}
