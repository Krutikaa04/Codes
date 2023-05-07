// An array is a collection of items of same data type stored at contiguous memory locations. 

import java.lang.*;
import java.io.*;
import java.util.*;

// 1D arrays in java

class Arrays {
    public static void printArray(int arr[], int n) {
        int len = arr.length;
        System.out.println("Len = "+len+ " n = "+ n);

        System.out.println();
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in an array : ");
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr, n);

    }
}
