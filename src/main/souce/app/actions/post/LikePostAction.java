package app.actions.post;

import app.entities.userdata.UserData;
import app.services.ArticleService;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by click on 5/19/2016.
 */
public class LikePostAction {
    // check if user like post
    // if not - add like to post and add user post to user
    // if like - dislike post
    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    public void like(int postId, String userEmail){
        if(!checkLike(postId, userEmail)){
            // like
            userService.addLikePost(postId, userEmail);
            articleService.likeArticle(postId);
        }
        else{
            // dislike
            articleService.dislikeArticle(postId);
            userService.removelikePost(postId, userEmail);
        }

    }
    public boolean checkLike(int postId, String userEmail){
        UserData userData = userService.getUser(userEmail);
        return userData.getLikePosts().contains(postId);
    }
}
