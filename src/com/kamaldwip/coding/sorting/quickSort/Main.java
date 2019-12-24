package com.kamaldwip.coding.sorting.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] inputArr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Input Array is : "+ Arrays.toString(inputArr));
        quickSort(inputArr,0,inputArr.length);
        System.out.println("Quick Sort output is : "+Arrays.toString(inputArr));

    }

    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);

    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){
            while (i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }


}
