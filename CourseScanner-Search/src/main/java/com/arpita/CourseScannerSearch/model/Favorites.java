package com.arpita.CourseScannerSearch.model;

import java.util.List;

public class Favorites {
    private int id;
    private List<Topics> topics;

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

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }
}
