package pro.sky.course1;

public class Main {
    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer+secondBoxer);
        System.out.println(firstBoxer-secondBoxer);
        System.out.println(secondBoxer-firstBoxer);
        System.out.println(secondBoxer%firstBoxer);

        var hours = 640;
        var personHours = 8;
        var person = hours/personHours;
        System.out.println("Всего работников в компании "+ person);
        person += 94;
        hours = person*personHours;
        System.out.println("Если в компании работает "+ person +" человек, то всего "+ hours +" часов работы может быть поделено между сотрудниками");
    }
}


