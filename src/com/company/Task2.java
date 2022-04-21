package com.company;

/**
 * Работа с строкой
 * <p>
 * Создать строку “Апельсин,Яблоко,Гранат,Груша”.
 * Воспользоваться методом split для извлечения всех названий фруктов в массив.
 * Найти и вывести на экран самое длинное название фрукта
 * с преобразованием всех символов в нижний регистр.
 * Создать «сокращенный» вариант названия фрукта.
 * Получить подстроку из первых 3-х символов названия фрукта. Вывести на экран.
 * <p>
 * Создать строку “   Я_новая_строка      ”. (с такими же пробелами)
 * Преобразовать строку: Убрать лишние пробелы в начале и конце
 * Преобразовать строку: заменить все символы ‘_’ на пробелы.
 * Вывести окончательный вариант на экран.
 * <p>
 * Создать Scanner для ввода текста. Выводим на экран сообщение с текстом:
 * «Вы ввели: <ваш текст>»
 * Добавить проверку: если введенный текст начинается со слова
 * “Запуск”, выводим на экран «Запускаем процесс»
 * Добавить проверку: если введенный текст заканчивается на слово
 * “завершен”, выводим на экран «Процесс завершен»
 * Добавить проверку: если введенный текст содержит слово “ошибка”
 * (с любым регистром букв), выводим на экран «Произошла ошибка»
 * <p>
 * Создать StringBuilder:
 * * Добавить в него все ранее созданные строки.
 * * После каждой 3-й строки выполнять перенос на новую строку.
 * * Развернуть содержимое задом на перед.
 * * Собрать StringBuilder в строку. Вывести ее на экран.
 */

public class Task2 {

    public static void main(String[] args) {

        String str1 = "Апельсин,Яблоко,Гранат,Груша";
        String[] mas_str = str1.split(",");

        String max = mas_str[0];

        for (int i = 1; i < mas_str.length; ++i) {
            if (max.length() < mas_str[i].length()) max = mas_str[i];
        }
        System.out.println(max.toLowerCase());

        System.out.println(max.toLowerCase().substring(0, 3));


        //Task 2.2

        String str2 = "   Я_новая_строка      ";
        String str3 = str2.trim().replaceAll("_", " ");
        System.out.println(str3);

        //Task 2.3

        String scanner = " оШиБкА ";
        System.out.println("Вы ввели: " + scanner);

        if (scanner.startsWith("Запуск"))
            System.out.println("Запускаем процесс");

        if (scanner.endsWith("завершен"))
            System.out.println("Процесс завершен");

        if (scanner.compareToIgnoreCase("ошибка")==0) // почему-то не работает. Вроде правильно. Буду разбиратся
            System.out.println("Произошла ошибка");

        StringBuilder allText = new StringBuilder();
        allText.append(str1).append(str3).append(scanner).append("\n");

        //Не понятно условие "После каждой 3-й строки выполнять перенос на новую строку."


        StringBuilder allTextRev = allText.reverse();
        System.out.println(allTextRev);
    }
}