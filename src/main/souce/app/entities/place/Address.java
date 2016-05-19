package app.entities.place;

/**
 * Created by click on 5/5/2016.
 */
public class Address {
    private int id;
    private String region;
    private String city;
    private String street;
    private Short nubmerOHouse;

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Short getNubmerOHouse() {
        return nubmerOHouse;
    }

    public void setNubmerOHouse(Short nubmerOHouse) {
        this.nubmerOHouse = nubmerOHouse;
    }
}
