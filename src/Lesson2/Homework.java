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

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche


        char[] arrayChar = new char[5];

        arrayChar[0] = 'a';
        arrayChar[1] = 'b';
        arrayChar[2] = 'c';
        arrayChar[3] = 'd';
        arrayChar[4] = 'e';

        System.out.println(arrayChar);

        arrayChar[3] = 'h' ;

        System.out.println(arrayChar);







    }
}
