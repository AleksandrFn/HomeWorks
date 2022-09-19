package pro.sky.course1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Dog = "+dog);
        System.out.println("Cat = "+cat);
        System.out.println("Peper = "+paper);

        //Задача 2
        System.out.println("Задача 2");
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("Dog = "+dog);
        System.out.println("Cat = "+cat);
        System.out.println("Peper = "+paper);

        //Задача 3
        System.out.println("Задача 3");
        var dog1 =8.0;
        dog1 -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Dog = "+dog1);
        System.out.println("Cat = "+cat);
        System.out.println("Peper = "+paper);
    }
}