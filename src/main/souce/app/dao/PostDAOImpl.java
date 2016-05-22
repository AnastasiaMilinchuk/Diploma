package app.dao;

import app.entities.entityActivity.Comment;
import app.entities.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Created by click on 5/21/2016.
 */
public class PostDAOImpl implements PostDAO {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Post getPostById(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(id));
        Post post = mongoTemplate.findOne(query, Post.class);
        if(post != null) {
            System.out.println("post: " + post.getTitle());
        }
        return post;
    }

    @Override
    public List<Post> getPostByTag(int tag) {
        Query query = new Query();
        query.addCriteria(Criteria.where("tags").all(tag));
        List<Post> posts = mongoTemplate.find(query, Post.class);
        return posts;
    }

    @Override
    public List<Post> getPostsList() {
        List<Post > posts = mongoTemplate.findAll(Post.class);
        posts.remove(0);
        return posts;
    }

    @Override
    public int likePost(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(id));
        Update update = new Update();
        update.inc("likes", 1);
        mongoTemplate.updateFirst(query, update, Post.class);
        Post post = mongoTemplate.findOne(query, Post.class);
        return post.getLikes();
    }

    @Override
    public int dislikePost(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(id));
        Update update = new Update();
        update.inc("likes", -1);
        mongoTemplate.updateFirst(query, update, Post.class);
        Post post = mongoTemplate.findOne(query, Post.class);
        return post.getLikes();
    }

    @Override
    public Post addComment(Comment comment, int postId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(postId));
        Update update = new Update();
        update.addToSet("comments", comment);
        return mongoTemplate.findOne(query, Post.class);
    }

    @Override
    public Post deleteComment(int id) {
        return null;
    }
}
