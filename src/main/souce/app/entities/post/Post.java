package app.entities.post;


import java.sql.Date;
import java.util.List;

/**
 * Created by click on 5/16/2016.
 */
public class Post {
    private int id;
    private String title;
    private String author;
    private int likes;
    private Date createDate;
    private List<String> tags;
    private String smallText;

    public Post(int id, String title, String author, int likes, Date createDate, List<String> tags, String smallText) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.likes = likes;
        this.createDate = createDate;
        this.tags = tags;
        this.smallText = smallText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
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
}
