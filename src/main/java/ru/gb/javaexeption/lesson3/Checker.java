package ru.gb.javaexeption.lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Checker {
    default boolean checkDate(String[] str) {
        boolean result = false;
        Pattern pattern = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}"); //Здесь должен быть шаблон с числом \d но компилятор говорит чтонедопустимый символ
        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);
            if (matcher.matches()) {
                return true;
            }
        }
        return result;
    }

    default boolean checkGender(String[] str) {
        boolean result = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("m") || str[i].equalsIgnoreCase("f")) {
                return true;
            }
        }
        return result;
    }
// Здесь возникли трудности как их решить пока непонял
    default boolean checkTelephone(String[] str) {
        boolean result = false;
        Pattern pattern = Pattern.compile("[0123456789]{10}"); //Здесь должен быть шаблон с числом \d но компилятор говорит что недопустимый символ
        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);
            if (matcher.matches()) {
                return true;
            }
        }
        return result;

    }
}
