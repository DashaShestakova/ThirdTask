package com.epam.idea.task.third.data;

public class AircompanyFactory {
    public AircompanyCreator setType(AircompanyType type) {
        switch (type) {
            case AIRBUS_AND_BOEING:
                return new AirbusAndBoeingAircompanyCreator();
            default:
                throw new IllegalArgumentException("Wrong type " + type);
        }
    }
}
