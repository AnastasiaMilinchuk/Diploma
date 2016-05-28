package app.entities.post;


import app.entities.entityActivity.Comment;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by click on 5/16/2016.
 */
@Document(collection = "posts")
public class Post {
    private String id;
    private int config_id;
    private String title;
    private String author;
    private String authorEmail;
    private int likes;
    private String createDate;
    private List<String> tags;
    private String smallText;
    private String text;
    private List<Comment> comments;
    private List<String> photos;
    public Post() {
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getConfig_id() {
        return config_id;
    }

    public void setConfig_id(int config_id) {
        this.config_id = config_id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post(int id, String title, String author, int likes, String createDate, List<String> tags, String smallText) {
        this.config_id = id;
        this.title = title;
        this.author = author;
        this.likes = likes;
        this.createDate = createDate;
        this.tags = tags;
        this.smallText = smallText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getSmallText() {
        return smallText;
    }

    public void setSmallText(String smallText) {
        this.smallText = smallText;
    }

    public Set<String> getCommentAuthors() {
        Set<String> commentAuthors = new HashSet<>(comments.size());
        for(Comment c: comments) {
            commentAuthors.add(c.getAuthorEmail());
        }
        return commentAuthors;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }
}
