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
        int age = 30;
        boolean kid = age >= 2 && age <= 6;
        if (kid) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в детский сад.");
        }
        boolean schoolboy  = age >= 7 && age <= 18;
        if (schoolboy) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в школу.");
        }
        boolean student = age >= 18 && age <= 24;
        if (student) {
            System.out.println("Если человеку " + age + ", то его место в университете.");
        }
        boolean worker = age >= 24;
        if (worker) {
            System.out.println("Если человеку " + age + ", то ему пора ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
    }
    public static void task6() {
        System.out.println("Задание 6");
    }
    public static void task7() {
        System.out.println("Задание 7");
    }
}