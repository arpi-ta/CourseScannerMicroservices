package com.arpita.CourseScannerSearch.model;

import javax.persistence.Id;

public class Topics {


    private String id;
    private String name;
    private String description;
    private String ratings;

    public Topics(){

    }

    public Topics(String id, String name, String description, String ratings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ratings = ratings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Topics{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ratings='" + ratings + '\'' +
                '}';
    }
}



