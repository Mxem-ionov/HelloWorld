//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World#2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("rev1");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("rev2");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("rev3");
            var friend = 19;
        System.out.println(friend);
        System.out.println(friend - 2);
        System.out.println(friend / 7);
        System.out.println("end friend");
                var uberFrog = 3.5;
        System.out.println(uberFrog);
                uberFrog = uberFrog * 10;
        System.out.println(uberFrog);
                uberFrog = uberFrog / 3.5;
        System.out.println(uberFrog);
                uberFrog = uberFrog + 4;
        System.out.println(uberFrog);
        System.out.println("end uberFrog");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer2 + weightBoxer1;
        System.out.println("Масса двух бойцов " + totalWeight + " кг");
        System.out.println("Разница в весе двух бойцов " + (weightBoxer1 - weightBoxer2) + " кг");
        System.out.println("Разница в весе двух бойцов " + weightBoxer2 % weightBoxer1 + " кг");
        var allTime = 640;
        var timeToOneWorkman = 8;
        var totalWorkman = allTime / timeToOneWorkman;
        System.out.println("Всего работников в компании - " + totalWorkman + " человек");
        totalWorkman = totalWorkman + 94;
        System.out.println("Если в компании работает " + totalWorkman + " человек, то всего " + allTime / totalWorkman +
                " часов работы может быть поделено между сотрудниками");
    }
}
