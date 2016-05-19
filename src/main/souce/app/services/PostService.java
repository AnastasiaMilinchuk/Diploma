package app.services;

import app.entities.post.Post;

import java.util.List;

/**
 * Created by click on 5/16/2016.
 */
public interface PostService {
    public List<Post> getPostsList();
    public Post getPostById(int id);
    public List<Post> getPostByTag(int tag);
}
