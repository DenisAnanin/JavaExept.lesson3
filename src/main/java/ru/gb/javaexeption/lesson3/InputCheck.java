package ru.gb.javaexeption.lesson3;

import java.io.IOException;

public class InputCheck implements InputData, SplitsOfData, AutoCloseable, Checker, Write {
    protected void checkData() throws InputDataExeption, DataFormatExeption, IOException {
        String[] data = split(read(), " ");
        if (data.length == 6) {

            if (!checkDate(data)) {
                throw new DataFormatExeption("Неверный формат даты. Дата должна быть указана в формате dd.mm.yyyy");
            }

            if (!checkGender(data)) {
                throw new DataFormatExeption("Неверный формат пола. Пол должен быть указан латинской буквой M или F");
            }

            if (!checkTelephone(data)) {
                throw new DataFormatExeption("Неверно указан номар телефона. Номер должен содержать не менее 10 чисел.");
            }
            checkTelephone(data);
            writer(data);

        } else {
            throw new InputDataExeption("Неверное колличество введенных данных " + data.length);
        }
    }

//   protected String checkBirthDate(String birthDate) {

//   }

    @Override
    public void close() throws Exception {

    }
}
