package ru.spring.API.ObjectAPITourAPP.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Objects")
public class MapObject {
    @Id
    private ObjectId id;
    private String name;
    private float rating;
    private String number;
    private String location;
    private int reviewsCount;
    private int openingHour;
    private int closingHour;

    public MapObject() {
    }

    public MapObject(ObjectId id, String name, float rating,
                     String number, String location, int reviewsCount,
                     int openingHour, int closingHour) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.number = number;
        this.location = location;
        this.reviewsCount = reviewsCount;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(int openingHour) {
        this.openingHour = openingHour;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(int closingHour) {
        this.closingHour = closingHour;
    }
}
