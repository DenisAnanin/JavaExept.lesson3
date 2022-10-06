package ru.gb.javaexeption.lesson3;

import java.util.Scanner;

public interface InputData {
    default String read() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите данные");
        String str = scaner.nextLine();
        scaner.close();
        return str;
    }
}
