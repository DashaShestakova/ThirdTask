package com.epam.idea.task.third;

import com.epam.idea.task.third.data.AircompanyCreator;
import com.epam.idea.task.third.data.AircompanyFactory;
import com.epam.idea.task.third.exception.DataException;
import com.epam.idea.task.third.logic.Calculator;
import com.epam.idea.task.third.model.Aircompany;
import com.epam.idea.task.third.view.Printer;
import com.epam.idea.task.third.view.PrinterFactory;

import static com.epam.idea.task.third.data.AircompanyType.AIRBUS_AND_BOEING;

public class Main {
    public static void main(String[] args) throws DataException {
        AircompanyFactory aircompanyFactory = new AircompanyFactory();
        AircompanyCreator aircompanyCreator = aircompanyFactory.setType(AIRBUS_AND_BOEING);
        Aircompany aircompany = aircompanyCreator.createAircompany();

        Calculator calculator = new Calculator();
        int capacity = calculator.sumCapacity(aircompany);

        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.setPrinterType("file");
        printer.print(capacity);
    }
}
