public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("total weight = " + (boxer1+boxer2));
        System.out.println("the difference is mass = " + (boxer2 - boxer1));
        System.out.println("the remainder of the division = " + (boxer2 % boxer1));

        var totalHours = 640;
        var hoursPerPerson = 8;
        System.out.println("Всего работников в компании - " + (totalHours / hoursPerPerson) + " человек");
        var pernons = totalHours / hoursPerPerson;
        var newPersons = pernons + 94;
        var newTotalHours = newPersons * 8;
        System.out.println("Если в компании работает " + newPersons + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
            }


}