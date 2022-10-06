package ru.gb.javaexeption.lesson3;


public interface SplitsOfData {
    default String[] split(String inputString, String splitter) {

        String[] splitedSting = inputString.split(splitter);

        return splitedSting;
    }
}
