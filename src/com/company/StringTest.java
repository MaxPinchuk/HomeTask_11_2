package com.company;

import java.nio.charset.StandardCharsets;

/**
 * Создать класс StringTest с main методом
 * Создать произвольные строки разными вариантами:
 * 1) Литерал
 * 2) new
 * 3) массив символов
 * 4) из байтов
 * 5) С помощью StringBuilder
 */

public class StringTest {

    public static void main(String[] args) {

        String str1 = "Hillel";
        String str2 = new String("Hillel");

        char data[] = {'H', 'i', 'l', 'l', 'e', 'l'};
        String str3 = new String(data);

        String str4 = "Hillel";
        String str5 = new String(str4.getBytes(StandardCharsets.UTF_8));

        StringBuilder builder = new StringBuilder("Hillel");
        String str6 = builder.toString();

        System.out.println(str1 + ", " + str2 + ", " + str3 + ", " + str5 + ", " + str6);
    }
}