/**
 * Java 1. Homework 3
 *
 * @author Mikhail Orlov
 * @version 18.2.2022
 */

package ru.geekbrains.lesson3;

import java.util.Arrays;

class HomeWorkN3 {

    //Task 1
    public static void main (String [] args) {
    }
    static void invertArray(){
        int[] arr = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
                System.out.println(Arrays.toString(arr));
        }
    }

    //Task 2
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(Arrays.toString(arr));
        }
    }

    //Task 3
    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    //Task 4
        static void fillDiagonal() {
            int[][] arr4 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    arr4 [i][j] = 1;
                }
                System.out.println(arr4[i][j] + " ");
            }
        }
        }
    //Task 5
        static int[] fillArray(int len, int initialValue) {
            int[] arr5 = new int[len];
            for (int i = 0; i < arr5.length; i++) {
                arr5[i] = initialValue;
                System.out.println(Arrays.toString(arr5));
            }
            return arr5;
        }
    }








