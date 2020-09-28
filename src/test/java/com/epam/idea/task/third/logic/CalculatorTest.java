package com.epam.idea.task.third.logic;

import com.epam.idea.task.third.model.Aircompany;
import com.epam.idea.task.third.model.Plane;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSumCapacityShouldSumWhenNumbersAreNegative(){
        Aircompany aircompany = new Aircompany();
        aircompany.addPlane(new Plane("Airbus", 500));
        aircompany.addPlane(new Plane("Airbus", 900));

        Calculator calculator = new Calculator();
        int capacity = calculator.sumCapacity(aircompany);


        Assert.assertEquals(1400, capacity);
    }
}
