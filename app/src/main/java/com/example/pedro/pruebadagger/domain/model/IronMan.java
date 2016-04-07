package com.example.pedro.pruebadagger.domain.model;

import com.example.pedro.pruebadagger.data.retrofit.model.Images;

import java.util.List;

/**
 * Created by pedro on 6/04/16.
 */
public class IronMan {

    private String character;
    private String name;
    private String description;
    private List<Images> images;

    public IronMan(){}

    public IronMan(String character, String name, String description, List<Images> images) {
        this.character = character;
        this.name = name;
        this.description = description;
        this.images = images;
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
