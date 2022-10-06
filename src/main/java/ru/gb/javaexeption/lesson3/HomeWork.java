package ru.gb.javaexeption.lesson3;

import java.io.IOException;

public class HomeWork {
    public static void main(String[] args) {

        try (InputCheck test = new InputCheck()) {
            test.checkData();
        } catch (DataFormatExeption | InputDataExeption e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        System.out.println();
    }

}
