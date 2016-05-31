package app.services;

import app.entities.place.Place;

import java.util.List;

/**
 * Created by click on 5/31/2016.
 */
public interface PlaceService {
    public List<Place> getPlacesByUser(String email);
}
