package com.company;

import java.util.Scanner;

public class Largestandsmallestnumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int sizeofarray = sc.nextInt();
        int arr[] = new int[sizeofarray];
        System.out.println("Enter array elements = " + sizeofarray);
        for (int i = 0; i < sizeofarray; i++) {
            arr[i] = sc.nextInt();
        }
        int highestnumber = arr[0];
        int lowestnumber = arr[0];
        for (int i = 1; i < sizeofarray; i++) {
            if (arr[i] > highestnumber) {
                highestnumber = arr[i];
            }
            if (arr[i] < lowestnumber) {
                lowestnumber = arr[i];
            }
        }
        System.out.println("Largest number from the given number is " + highestnumber);
        System.out.println("Smallest number from the given number is " + lowestnumber);
    }
}
