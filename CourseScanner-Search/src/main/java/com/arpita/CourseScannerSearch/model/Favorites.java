package com.arpita.CourseScannerSearch.model;

import java.util.List;

public class Favorites {
    private int id;
    private List<Object> topics;

    public Favorites() {
    }

    public Favorites(int topicsId) {
        this.id = topicsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getTopics() {
        return topics;
    }

    public void setTopics(List<Object> topics) {
        this.topics = topics;
    }
}
