package app.dao;

import app.entities.entityActivity.Tag;
import com.sun.org.apache.bcel.internal.generic.LUSHR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Created by click on 5/31/2016.
 */
public class TagDAOImpl implements TagDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Tag> getAllTags() {
        List<Tag> tags = mongoTemplate.findAll(Tag.class);
        tags.remove(0);
        return tags;
    }

    @Override
    public Tag getTagById(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(id));
        return mongoTemplate.findOne(query, Tag.class);
    }

    @Override
    public Tag getTagByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query, Tag.class);
    }

    @Override
    public void incPostQuantity(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(id));
        Update update = new Update();
        update.inc("postsQuantity", 1);
        mongoTemplate.updateFirst(query, update, Tag.class);
    }

    @Override
    public void decPostQuantity(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(id));
        Update update = new Update();
        update.inc("postsQuantity", -1);
        mongoTemplate.updateFirst(query, update, Tag.class);
    }

}
