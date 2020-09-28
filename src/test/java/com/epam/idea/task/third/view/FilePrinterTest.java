package com.epam.idea.task.third.view;

import com.epam.idea.task.third.view.FilePrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilePrinterTest {
    final String FILE_NAME = "src/test/resources/capasitytest.txt";

    @Test
    public void testPrintShouldPrintToFile() throws Exception {
        FilePrinter filePrinter = new FilePrinter(FILE_NAME);
        int totalCapacity = 1200;

        filePrinter.print(totalCapacity);

        int actual = readDataFromFile();

        Assert.assertEquals(totalCapacity, actual);

    }

    private int readDataFromFile() throws IOException{
        List<String> list = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        if(list.size() != 1){
            throw new IllegalStateException("There is no data in file " + FILE_NAME);
        }
        return Integer.valueOf(list.get(0));
    }
}
