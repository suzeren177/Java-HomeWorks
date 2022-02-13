/**
 * %W% %E% Mikhail Orlov
 *
 * Copyright (c) 1978-2022
 *
 * HomeWork №2 (Java Course 1.0)
 *
 * @author Mikhail
 * @version 13.02.2022
 *
 */

package ru.geekbrains.lesson2;

class HomeWorkN2 {
    public static void main (String[] args) {
        boolean result = within10and20 (5,10);
        System.out.println(result? "True" : "False");
        isPositiveOrNegative ();
        System.out.println(result? "Положительное" : "Отрицательное");
        printWordNTimes();
    }

    //Task 1

        static boolean within10and20 (int a, int b) {
        a = 5;
        b = 10;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    //Task 2

    static void isPositiveOrNegative() {
    int x = 5;
       if (x >= 0) {
           System.out.println("Положительное");
       }
       else {
           System.out.println("Отрицательное");
       }
    }

    //Task 3

    static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //Task 4

    static void printWordNTimes() {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            String str = "";
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}










