package app.dao;

import app.entities.entityActivity.Comment;
import app.entities.entityActivity.Tag;
import app.entities.post.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        Query tags = new Query();
        tags.addCriteria(Criteria.where("config_id").is(tag));
        Tag t = mongoTemplate.findOne(tags, Tag.class);
        Query query = new Query();
        query.addCriteria(Criteria.where("tags").all(t.getName()));
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
    public List<Post> getPostsListByUser(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where("authorEmail").is(email));
        List<Post> posts = mongoTemplate.find(query, Post.class);
        System.out.println("posts: " + posts.size());
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

        Query query1 = new Query();
        query1.addCriteria(Criteria.where("_id").is("config"));
        Update update1 = new Update();
        update1.inc("config_id", 1);
        mongoTemplate.updateFirst(query1, update1, Comment.class);
        Comment c = mongoTemplate.findOne(query, Comment.class);
        comment.setConfig_id(c.getConfig_id());

        Update update = new Update();
        update.addToSet("comments", comment);
        mongoTemplate.updateFirst(query, update, Post.class);
        return mongoTemplate.findOne(query, Post.class);
    }

    @Override
    public Post deleteComment(int postId, int commentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("config_id").is(postId));
        Post p = mongoTemplate.findOne(query, Post.class);
        Comment del = new Comment();
        for(Comment c: p.getComments()){
            if(c.getConfig_id() == commentId){
                del = c;
                break;
            }
        }
        Update update = new Update();
        update.pull("comments", del);
        mongoTemplate.updateFirst(query, update, Post.class);
        return mongoTemplate.findOne(query, Post.class);
    }

    @Override
    public List<Post> getRecentPosts() {
        Query query = new Query();
        query.with(new Sort(Sort.Direction.DESC,"config_id"));
        List<Post> posts = mongoTemplate.find(query, Post.class);
        posts.remove(posts.size() - 1);
        return posts;
    }

    @Override
    public List<Post> getMostPopularPosts() {
        Query query = new Query();
        query.with(new Sort(Sort.Direction.DESC,"likes"));
        List<Post> posts = mongoTemplate.find(query, Post.class);
        posts.remove(posts.size() - 1);
        return posts;
    }
}
