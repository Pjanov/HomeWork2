package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // TODO: Задача №1
        String myStr = "Мат и тут и там";
        System.out.println(palindrome(myStr));

        // TODO: Задача №2
        String fileName = "fileToWrite.txt";
        String text = "TEST";
        int numberRepetitions = 100;
        writeLine(fileName, repeatText(text, numberRepetitions));
    }

    /**
     * Напишите метод, который составит строку, состоящую из 100 повторений
     * слова TEST и метод, который запишет эту строку в простой текстовый файл,
     * обработайте исключения.
     */
    private static String repeatText(String str, int numberRepetitions) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberRepetitions; i++) {
            sb.append(str).append(' ');
        }
        return sb.toString();
    }

    /**
     * Напишите метод, который принимает на вход строку (String) и определяет
     * является ли строка палиндромом (возвращает boolean значение).
     */
    public static boolean palindrome(String str) {
        String string = str.toLowerCase(); // Преобразует все символы в этой строке в нижний регистр
        StringBuilder rev = new StringBuilder(string);
        rev.reverse(); // Приводит к замене этой последовательности символов на обратную последовательности.
        return rev.toString().equals(string); // equals сравнивает два объекта на равенство, возвращает true или false
    }

    /**
     * <h3>Запись строку в текстовый файл</h3>
     *
     * @param fileName путь к файлу
     * @param str      строка
     */
    public static void writeLine(String fileName, String str) {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write(str);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}