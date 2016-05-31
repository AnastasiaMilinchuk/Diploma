package app.services;

import app.dao.TagDAO;
import app.entities.entityActivity.Tag;
import app.mock.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by click on 5/19/2016.
 */
public class TagServiceImpl implements TagService {
    @Autowired
    TagDAO tagDAO;

    @Override
    public List<Tag> getAllTags() {
        return tagDAO.getAllTags();
    }

    @Override
    public Tag getTagById(int id) {
        return tagDAO.getTagById(id);
    }

    @Override
    public Tag getTagByName(String name) {
        return tagDAO.getTagByName(name);
    }

    @Override
    public void incPostQuantity(int id) {
        tagDAO.incPostQuantity(id);
    }

    @Override
    public void decPostQuantity(int id) {
        tagDAO.decPostQuantity(id);
    }

}
