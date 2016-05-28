package app.dao;

import app.entities.entityActivity.Comment;

/**
 * Created by click on 5/23/2016.
 */
public interface CommentDAO {
    public void addComment(Comment commentId);
    public void deleteComment(int commentId);
}
