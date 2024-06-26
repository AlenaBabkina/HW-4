public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется зплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("Задача 4");
        int yearA = 5;
        int yearB = 10;
        int yearC = 20;
        int yearD = 25;
        if (yearA >= 2 && yearA <= 6) {
            System.out.println("Если возраст человека равен " + yearA + ", то ему нужно ходить в детский сад");
        }
        if (yearB >= 7 && yearB <= 17) {
            System.out.println("Если возраст человека равен " + yearB + ", то ему нужно ходить в школу");
        }
        if (yearC >= 18 && yearC <= 24) {
            System.out.println("Если возраст человека равен " + yearC + ", то ему нужно ходить в университет");
        }
        if (yearD > 24) {
            System.out.println("Если возраст человека равен " + yearD + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");
        int ageChild = 3;
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }

        System.out.println("Задача 6");
        int passenger = 120;
        if (passenger < 60) {
            System.out.println("В вагоне есть места сидячие");
        } else if (passenger >= 60 && passenger < 102) {
            System.out.println("В вагоне есть места стоячие");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean oneIsBiggest = one > two && one > three ;
        boolean twoIsBiggest = two > one && one > three;
        boolean threeIsBiggest = three > one && three > two;
        if (oneIsBiggest) {
            System.out.println("Один больше всех");
        } else if (twoIsBiggest) {
            System.out.println("Два больше всех");
        } else if (threeIsBiggest) {
                System.out.println("Три больше всех");
        }

    }
}