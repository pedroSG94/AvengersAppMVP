package com.example.pedro.pruebadagger.data.retrofit.model;

/**
 * Created by pedro on 6/04/16.
 */
public class AvengersRetrofit {

    private int id;
    private String character;
    private String name;
    private String image;
    private boolean active;

    public AvengersRetrofit(){}

    public AvengersRetrofit(int id, String character, String name, String image, boolean active){
        this.id = id;
        this.character = character;
        this.name = name;
        this.image = image;
        this.active = active;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
