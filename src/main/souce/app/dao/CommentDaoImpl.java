package app.dao;

import app.entities.entityActivity.Comment;
import app.entities.userdata.UserData;
import org.springframework.aop.target.CommonsPoolTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * Created by click on 5/23/2016.
 */
public class CommentDaoImpl implements CommentDAO {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void addComment(Comment comment) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is("config"));
        Update update = new Update();
        update.inc("config_id", 1);
        mongoTemplate.updateFirst(query, update, Comment.class);
        Comment c = mongoTemplate.findOne(query, Comment.class);
        comment.setConfig_id(c.getConfig_id());
        mongoTemplate.save(comment, "comments");
    }

    @Override
    public void deleteComment(int commentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(commentId));
        mongoTemplate.remove(query, Comment.class);
    }
}
