package app.actions.post;

import app.entities.entityActivity.Comment;
import app.entities.post.Post;
import app.entities.userdata.UserData;
import app.services.ArticleService;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by click on 5/21/2016.
 */
public class CommentPostAction {
    @Autowired
    ArticleService articleService;

    @Autowired
    UserService userService;

    public Post comment(Comment comment, int postId, String userEmail){
        UserData userData = userService.getUser(userEmail);
        comment.setAuthor(userData.getFirstName() + " " + userData.getLastName());
        comment.setAuthor_id(userData.getConfig_id());
        comment.setAuthorPhotoUrl(userData.getAvatar());
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = new Date();
        try {
            comment.setDateCreate(dateFormat.parse(dateFormat.format(date)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        articleService.addComment(comment, postId);
        return articleService.getArticleById(postId);
    }
}
