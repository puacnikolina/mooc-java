package org.example.part7.algorithms;

import java.util.Arrays;

public class Sorting {

    static void main() {
//        int[] numbers = {6, 5, 8, 1, 11};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Sorting.sort(numbers);
    }

    public static int smallest(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int indexOfSmallest(int[] array){
        int min = array[0];
        int minIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex];
        int minIndex = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if(table[i] < min){
                min = table[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }

    public static void sort(int[] array) {
        int smallest = 0;
        int indexOfSmallest = 0;
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
             smallest = smallest(array);
             indexOfSmallest = indexOfSmallestFrom(array,i);
             swap(array,i,indexOfSmallest);
             System.out.println(Arrays.toString(array));
         }
    }

}
