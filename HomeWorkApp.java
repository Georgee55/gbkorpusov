package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a = 2;
        int b = 3;
        int c = a + b;

        System.out.println("Сумма положительная");
        if (c<0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value =320;

        if (value > 0) {
            if (value>0 && value<=100) {
                System.out.println("Желтый");
            }
        } else {
            System.out.println("Красный");
            if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            }
        }
        System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a=110;
        int b=20;

        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
