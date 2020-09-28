package com.epam.idea.task.third.model;

public class Plane {
    private int capacity;
    private String name;

    public Plane(String name, int capacity){
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
