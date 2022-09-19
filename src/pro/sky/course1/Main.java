package pro.sky.course1;

public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общий вес двух бойцов " + (firstBoxerWeight+secondBoxerWeight));
        System.out.println("Разница весов двух боксеров " + (secondBoxerWeight-firstBoxerWeight));

        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов двух боксеров (Первый способ) " + (secondBoxerWeight-firstBoxerWeight));
        System.out.println("Разница весов двух боксеров (Второй способ) " + (secondBoxerWeight%firstBoxerWeight));

        //Задача 8
        System.out.println("Задача 8");
        var hours = 640;
        var personHours = 8;
        var person = hours/personHours;
        System.out.println("Всего работников в компании "+ person + "человек");
        person += 94;
        hours = person*personHours;
        System.out.println("Если в компании работает "+ person +" человек, то всего "+ hours +" часов работы может быть поделено между сотрудниками");

    }
}


