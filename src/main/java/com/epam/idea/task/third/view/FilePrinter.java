package com.epam.idea.task.third.view;

import com.epam.idea.task.third.exception.DataException;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private String fileName;

    public FilePrinter (String fileName){
        this.fileName = fileName;
    }

    @Override
    public void print(int result) throws DataException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            String formatedValue = String.valueOf(result);
            writer.write(formatedValue);
        }catch (IOException e){
            throw new DataException(e.getMessage());
        }
    }
}
