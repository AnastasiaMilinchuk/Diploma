package app.services;

import app.entities.entityActivity.Comment;
import app.entities.post.Post;
import app.entities.userdata.UserData;

import java.util.List;

/**
 * Created by click on 5/18/2016.
 */
public interface PostService {
    public app.entities.post.Post getArticleById(int id);
    public List<Post> getArticlesByTag(int tag);
    public List<Post> getArticlesList();
    public List<Post> getPostsByUser(String email);
    public int likeArticle(int id);
    public int dislikeArticle(int id);
    public Post addComment(Comment comment, int postId);
    public Post deleteComment(int postId, int commentId);
}
