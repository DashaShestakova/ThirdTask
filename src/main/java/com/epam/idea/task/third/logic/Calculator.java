package com.epam.idea.task.third.logic;

import com.epam.idea.task.third.model.Aircompany;
import com.epam.idea.task.third.model.Plane;

public class Calculator {
    public int sumCapacity(Aircompany aircompany){
        int sum = 0;

        for (Plane plane : aircompany.getPlanelist()){
            sum += plane.getCapacity();
        }

        return sum;
    }
}
