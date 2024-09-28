package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNewArray = new int[10];
        myNewArray[9]=50;
        System.out.println(myNewArray[9]);

        double[] mySecondNewArray = new double[20];
        mySecondNewArray [17]=3.5;
        System.out.println(mySecondNewArray[17]);

        int[] firstArray = { 1,2,3,4,5,6,7,8,9,10};
        System.out.println("The value of first value is = " + firstArray[0]);
        System.out.println("The value of first value is = " + firstArray[9]);
        int arrayLength = firstArray.length;
        System.out.println(arrayLength);

        int[] newArray = { 5, 4,3,2,1};
        System.out.println(newArray[3]);

        int[] newArray1;
        newArray1 = new int[]{9, 8, 7, 6, 5, 4};
        int i;
        for ( i = 0 ; i < newArray1.length ; i++){
            System.out.print(newArray1[i] + " ");
        }

        System.out.println();
        int [] newArray2 = new int[5];
        for ( i = 0 ; i < newArray2.length ; i++){
            System.out.print(newArray2[i] + " ");
        }

        System.out.println();
        for ( int element : firstArray){
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(firstArray));

        System.out.println();
        Object [] objectArray= new Object[5];
        objectArray[0]=1;
        System.out.println(objectArray[0]);

        objectArray[2]= "Hello";
        System.out.println(objectArray[2]);
        System.out.print(objectArray[3] = "World");



    }
}
