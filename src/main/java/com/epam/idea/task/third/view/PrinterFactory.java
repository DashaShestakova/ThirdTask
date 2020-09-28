package com.epam.idea.task.third.view;

public class PrinterFactory {
    private static final String FILE_NAME = "capacity.txt";

    public Printer setPrinterType(String type){
        switch (type){
            case "console":
                return new ConsolePrinter();
            case "file":
                return new FilePrinter(FILE_NAME);
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
    }
}
