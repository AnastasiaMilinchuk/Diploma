package app.dao;

import app.entities.entityActivity.Comment;
import app.entities.post.Post;

import java.util.List;

/**
 * Created by click on 5/21/2016.
 */
public interface PostDAO {
    public app.entities.post.Post getPostById(int id);
    public List<Post> getPostByTag(int tag);
    public List<Post> getPostsList();
    public int likePost(int id);
    public int dislikePost(int id);
    public Post addComment(Comment comment, int postId);
    public Post deleteComment(int id);
}