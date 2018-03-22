package com.nimesh;

import java.util.Scanner;

public class nChallenge {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myInt = getInt(5);
        int[] descending = sort(myInt);
        print(descending);
        System.out.println("The average of sorted number is "+avg(descending));
    }

    public static int[] getInt(int num){
        int[] array = new int[num];
        System.out.println("Enter "+num+" numbers that you desire.");
        for(int i = 0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element "+i+" is "+array[i]);
        }
    }

    public static int[] sort(int[] array){
        int[] sortList = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sortList[i] = array[i];
        }
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortList.length - 1; i++){
                if(sortList[i]<sortList[i+1]){
                    temp = sortList[i];
                    sortList[i] = sortList[i+1];
                    sortList[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortList;

    }

    public static double avg(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return  sum/ (double) array.length;
    }

}
