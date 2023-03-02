public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();


        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumWeight = firstBoxerWeight + secondBoxerWeight;
        var diffWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Общий вес двух бойцов равен " + sumWeight + " кг!");
        System.out.println("Разница в весе двух бойцов равна " + diffWeight + " кг!");
        System.out.println();

        System.out.println("Задача 7");
        var diffSecondBoxerMinusFirstBoxer = secondBoxerWeight - firstBoxerWeight;
        var diffSecondBoxerResidueFirstBoxer = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе двух бойцов путем вычитания равна "
                + diffSecondBoxerMinusFirstBoxer + " кг!");
        System.out.println("Разница в весе двух бойцов путем остатка от деления равна "
                + diffSecondBoxerResidueFirstBoxer + " кг!");
        System.out.println();

        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var workingDay = 8;
        var humanQuantity = totalWorkingHours / workingDay;
        System.out.println("Всего работников в компании — " + humanQuantity + " человек");
        humanQuantity = humanQuantity + 94;
        totalWorkingHours = humanQuantity * 8;
        System.out.println("Если в компании работает " + humanQuantity + " человек, то всего " + totalWorkingHours +
                        " часов работы может быть поделено между сотрудниками");
        System.out.println();
    }

}
