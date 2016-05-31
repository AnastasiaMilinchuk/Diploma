package app.entities.entityActivity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by click on 5/5/2016.
 */
@Document(collection = "tags")
public class Tag {
    private String id;
    private int config_id;
    private String name;
    private int postsQuantity;

    public Tag() {
    }

    public Tag(String name, int postsQuantity) {
        this.name = name;
        this.postsQuantity = postsQuantity;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public void setPostsQuantity(int postsQuantity) {
        this.postsQuantity = postsQuantity;
    }
}
