package app.dao;

import app.entities.entityActivity.Tag;

import java.util.List;

/**
 * Created by click on 5/31/2016.
 */
public interface TagDAO {
    public List<Tag> getAllTags();
    public Tag getTagById(int id);
    public Tag getTagByName(String name);
    public void incPostQuantity(int id);
    public void decPostQuantity(int id);
}
