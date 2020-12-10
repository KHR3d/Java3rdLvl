package ru.hw.num1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrToArrList {

    public static void main(String[] args) {
        String[] arrayOfStrings = {"1", "2", "3", "4"};
        List<String> listOfStrings = new ArrayList<String>();

        // возвращает массив в виде списка
        // любое изменение в массиве приведет к изменению в списке ArrayList
        listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println("Полученный ArrayList с помощью метода Arrays.asList()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
    }
}
