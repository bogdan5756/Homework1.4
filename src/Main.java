import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int temp = 4;
        if (temp > 5) {
            System.out.println("На улице " + temp +" градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку!");
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed +" то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + ", то его место в университете.");
        }
        if (age >= 24) {
            System.out.println("Если человеку " + age + ", то ему пора ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int age = 15;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе, без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задание 6");
        int passenger = 103;
        if (passenger >= 1 && passenger <= 60) {
            System.out.println("Есть сидячее место в вагоне.");
        } else if (passenger > 60 && passenger <= 102) {
            System.out.println("Есть стоячее место в вагоне.");
        } else {
            System.out.println("В вагоне нет мест.");
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        int one = 50;
        int two = 50;
        int three = 50;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чем число " + two + " и " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше чем число " + one + " и " + three);
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " больше чем число " + one + " и " + two);
        } else {
            System.out.println("Все три числа равны");
        }
    }
}