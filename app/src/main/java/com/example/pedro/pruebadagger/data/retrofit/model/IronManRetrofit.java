package com.example.pedro.pruebadagger.data.retrofit.model;

import java.util.List;

/**
 * Created by pedro on 6/04/16.
 */
public class IronManRetrofit {

    private int id;
    private String character;
    private String name;
    private boolean active;
    private String description;
    private List<Images> images;

    public IronManRetrofit(){}

    public IronManRetrofit(int id, String character, String name, boolean active, String description, List<Images> images) {
        this.id = id;
        this.character = character;
        this.name = name;
        this.active = active;
        this.description = description;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
