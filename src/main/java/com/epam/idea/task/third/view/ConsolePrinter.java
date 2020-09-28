package com.epam.idea.task.third.view;

import com.epam.idea.task.third.exception.DataException;

public class ConsolePrinter implements Printer {

    @Override
    public void print(int result) throws DataException {
        System.out.println("Total capacity " + result);
    }
}
