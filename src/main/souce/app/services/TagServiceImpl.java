package app.services;

import app.entities.entityActivity.Tag;
import app.mock.*;

import java.util.List;

/**
 * Created by click on 5/19/2016.
 */
public class TagServiceImpl implements TagService {
    @Override
    public List<Tag> getAllTags() {
        return app.mock.PostService.getTags();
    }
}
