package com.epam.idea.task.third.data;

import com.epam.idea.task.third.model.Aircompany;
import com.epam.idea.task.third.model.Plane;

public class AirbusAndBoeingAircompanyCreator implements AircompanyCreator {

    @Override
    public Aircompany createAircompany() {
        Plane airbus = new Plane("Airbus", 500);
        Plane boeing = new Plane("Boeing", 700);

        Aircompany aircompany = new Aircompany();
        aircompany.addPlane(airbus);
        aircompany.addPlane(boeing);

        return aircompany;
    }
}
