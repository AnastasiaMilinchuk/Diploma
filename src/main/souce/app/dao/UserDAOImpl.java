package app.dao;

import app.entities.userdata.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * Created by click on 5/18/2016.
 */
public class UserDAOImpl implements UserDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    public UserDAOImpl() {
    }

    @Override
    public void create(UserData userData) {
        System.out.println("userName: " + userData.getEmail());
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is("config"));
        Update update = new Update();
        update.inc("config_id", 1);
        mongoTemplate.updateFirst(query, update, UserData.class);
        UserData u = mongoTemplate.findOne(query, UserData.class);
        userData.setConfig_id(u.getConfig_id());
        mongoTemplate.save(userData, UserData.COLLECTION);
    }
//

    @Override
    public UserData readByID(int id) {
        return null;
    }

    @Override
    public UserData readByEmail(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email));
        UserData userData = mongoTemplate.findOne(query, UserData.class);
        System.out.println("userData: " + userData.getEmail());
        return userData;
    }

    @Override
    public void update(UserData user) {

    }

    @Override
    public void delete(UserData user) {

    }

    @Override
    public void addLikePost(int postId, String userEmail) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(userEmail));
        Update update = new Update();
        update.addToSet("likePosts", postId);
        mongoTemplate.updateFirst(query, update, UserData.class);
    }
}
