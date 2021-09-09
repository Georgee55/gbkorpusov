package ru.geekbrains.lesson2;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(5, 5));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-5));
        printWordNTimes("пицца", 5);
        System.out.println(whichYearIsLeapYear(1977));

    }

    public static boolean within10and20(int a, int b) {
        int sum = a+b;
        if (sum <= 20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int a ) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if (a>=0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean whichYearIsLeapYear(int a)  {
        if(a%4 == 0 && a%100 !=0) {
            return true;
        } else if ((a%4 == 0) && (a%100 == 0) && (a%400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
