package app.entities.place;

/**
 * Created by click on 5/5/2016.
 */
public class Coordinate {
    private int id;
    private String longtitude;
    private String latitude;

    public Coordinate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
