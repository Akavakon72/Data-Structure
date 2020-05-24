package com.techocrack.search;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 19, 23, 34, 43, 53, 63};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to search:");
        int find  = sc.nextInt();
        int rtnVal = binarySearch(arr, 0, arr.length-1, find);
        if (rtnVal == -1) {
            System.out.println("Number " + find +" is not Found");
        } else {
            System.out.println("" + find + " found at position " + rtnVal);
        }
    }


    public static int binarySearch(int[] arr, int start , int end,  int find){
        if( start > end )
            return -1;
        
        int mid  =  start + (end - start)/2;
        if(arr[mid] == find)
            return mid;
        else if(arr[mid] > find)
            return binarySearch(arr, start, mid -1, find);
        else
            return binarySearch(arr, mid + 1, end, find );
    }
}
