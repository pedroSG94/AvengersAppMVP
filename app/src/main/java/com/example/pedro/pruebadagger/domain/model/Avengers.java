package com.example.pedro.pruebadagger.domain.model;

/**
 * Created by pedro on 14/03/16.
 */
public class Avengers {

    private String character;
    private String name;
    private String image;
    private boolean active;

    public Avengers(){}

    public Avengers(String character, String name, String image, boolean active){
        this.character = character;
        this.name = name;
        this.image = image;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroe() {
        return character;
    }

    public void setHeroe(String heroe) {
        this.character = heroe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
