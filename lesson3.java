package ru.geekbrains.lesson3;

import java.util.Arrays;

public class lesson3 {
    public static void main(String args[]) {
        invertArray();
        System.out.println(Arrays.toString(fillArray()));
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        fillDiagonal(5);
        printDoubleArr(dobleArr(10,5));
        System.out.println(Arrays.toString(
                findMinMax(new int[]{1,6,9,12,5,2,50})));
    }

    static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }

    static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0, j = 0; i < array.length; i++, j ++)
            array[i] = j;
        return array;
    }

    static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

    static void fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
    public static int[] dobleArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void printDoubleArr(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    static int[] findMinMax(int[] array) {
        int[] minmax = new int[2];
        minmax[0] = minmax[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minmax[0] > array[i])
                minmax[0] = array[i];
            if (minmax[1] < array[i])
                minmax[1] = array[i];
        }
        return minmax;
    }
}