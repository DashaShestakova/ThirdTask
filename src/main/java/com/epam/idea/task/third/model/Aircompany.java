package com.epam.idea.task.third.model;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {
    private List<Plane> planelist = new ArrayList<>();

    public List<Plane> getPlanelist (){
        return planelist;
    }

    public void addPlane (Plane plane){
        planelist.add(plane);
    }
}
