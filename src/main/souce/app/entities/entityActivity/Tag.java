package app.entities.entityActivity;

/**
 * Created by click on 5/5/2016.
 */
public class Tag {
    private int id;
    private String name;
    private int postsQuantity;

    public Tag() {
    }

    public Tag(int id, String name, int postsQuantity) {
        this.id = id;
        this.name = name;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
