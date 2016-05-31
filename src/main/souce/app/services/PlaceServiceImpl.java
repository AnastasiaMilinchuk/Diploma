package app.services;

import app.dao.PostDAO;
import app.entities.place.Place;
import app.entities.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 5/31/2016.
 */
public class PlaceServiceImpl implements PlaceService{
    @Autowired
    PostDAO postDAO;
    @Override
    public List<Place> getPlacesByUser(String email) {
        List<Post> posts = postDAO.getPostsListByUser(email);
        List<Place> places = new ArrayList<>();
        for(Post p: posts){
            places.add(p.getPlace());
        }
        return places;
    }
}
