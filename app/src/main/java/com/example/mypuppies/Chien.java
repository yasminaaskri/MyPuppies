package com.example.mypuppies;

public class Chien {
    private String imageName;
    private String name;
    private String breed;
    private String origin;

    public Chien(String imageName, String name, String breed, String origin) {
        this.imageName = imageName;
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public String getImageName() {
        return imageName;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getOrigin() {
        return origin;
    }
}
