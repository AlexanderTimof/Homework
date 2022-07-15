package Lesson2;

import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {

        //Задача №1

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String result1 = hi + world + newLine;
        for (int i = 0; i < 3; i++) {
            System.out.println(result1.trim());
        }

        //Задача №2

        float rost = 1.76f;
        int ves = 90;
        float index = ves / (rost * rost);
        System.out.println(index);

        //Задача №3

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
