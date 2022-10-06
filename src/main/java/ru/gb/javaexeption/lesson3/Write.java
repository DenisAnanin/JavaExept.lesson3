package ru.gb.javaexeption.lesson3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public interface Write {


    default void writer(String[] data) throws IOException {
        String s = "";
        for (int i = 0; i < data.length; i++) {
            s = s + data[i] + " ";
        }
//        String s = data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]+" "+data[5];
        Files.writeString(Path.of(data[0] + ".txt"), s + System.lineSeparator(), CREATE, APPEND);

    }
}
