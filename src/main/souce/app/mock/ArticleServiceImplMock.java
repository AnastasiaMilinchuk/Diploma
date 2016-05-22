package app.mock;

import app.entities.entityActivity.Comment;
import app.entities.post.Post;

import app.services.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by click on 5/18/2016.
 */
public class ArticleServiceImplMock implements ArticleService {
    @Autowired
    app.services.PostService postService;

    @Override
    public Post getArticleById(int id) {
        return postService.getPostById(id);
    }

    @Override
    public List<Post> getArticlesByTag(int tag) {
        return postService.getPostByTag(tag);
    }

    @Override
    public List<Post> getArticlesList() {
        return null;
    }

    @Override
    public int likeArticle(int id) {
        return postService.likePost(id);
    }

    @Override
    public int dislikeArticle(int id) {
        return postService.dislikePost(id);
    }

    @Override
    public Post addComment(Comment comment, int postId) {
        return null;
    }

    @Override
    public Post deleteComment(int id) {
        return null;
    }
}
