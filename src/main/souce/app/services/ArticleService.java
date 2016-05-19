package app.services;

import app.entities.post.Article;
import app.entities.post.Post;

import java.util.List;

/**
 * Created by click on 5/18/2016.
 */
public interface ArticleService {
    public app.entities.post.Post getArticleById(int id);
    public List<Post> getArticlesByTag(int tag);
}
