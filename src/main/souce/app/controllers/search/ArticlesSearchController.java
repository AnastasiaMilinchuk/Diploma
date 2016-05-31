package app.controllers.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Struct;

/**
 * Created by click on 5/8/2016.
 */
@Controller
public class ArticlesSearchController {

    @RequestMapping(value = "recent", method = RequestMethod.GET)
    public String loadRecentPosts(){
        return null;
    }

    @RequestMapping(value = "mostPopular", method = RequestMethod.GET)
    public String loadMostPopularPosts(){
        return null;
    }

    @RequestMapping(value = "recommended", method = RequestMethod.GET)
    public String loadRecommendedPosts(){
        return null;
    }
}
