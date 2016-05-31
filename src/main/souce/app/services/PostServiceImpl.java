package app.services;

import app.dao.PostDAO;
import app.entities.entityActivity.Comment;
import app.entities.post.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by click on 5/18/2016.
 */
public class PostServiceImpl implements PostService {

    @Autowired
    PostDAO postDAO;

    @Override
    public Post getArticleById(int id) {
        return postDAO.getPostById(id);
    }

    @Override
    public List<Post> getArticlesByTag(int tag) {
        return postDAO.getPostByTag(tag);
    }

    @Override
    public List<Post> getArticlesList() {
        return postDAO.getPostsList();
    }

    @Override
    public List<Post> getPostsByUser(String email) {
        return postDAO.getPostsListByUser(email);
    }

    @Override
    public int likeArticle(int id) {
        return postDAO.likePost(id);
    }

    @Override
    public int dislikeArticle(int id) {
        return postDAO.dislikePost(id);
    }

    @Override
    public Post addComment(Comment comment, int postId) {
        return postDAO.addComment(comment, postId);
    }

    @Override
    public Post deleteComment(int postId, int commentId) {
        return postDAO.deleteComment(postId, commentId);
    }
}
