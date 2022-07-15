package Lesson2;

import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String result1 = hi + world + newLine;
        for (int i = 0; i < 3; i++) {
            System.out.println(result1.trim());
        }

        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!



        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645


        float rost = 1.76f;
        int ves = 90;
        float index = ves / (rost * rost);
        System.out.println(index);


    }
}
