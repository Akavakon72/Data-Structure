package com.techocrack.binarysearch;

import java.util.Scanner;

public class SortedArrayBinarySearch {
    //time complexity is O(logn base 2)123
    //as we are dividing or by 2 so reducing to half
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 19, 23, 34, 43, 53, 63};
        int find = 43;
        Scanner sc = new Scanner(System.in);
        find  = sc.nextInt();
        int rtnVal = binarySearch(arr, find, arr.length);
        if (rtnVal == -1) {
            System.out.println("Number " + find +" is not Found");
        } else {
            System.out.println("" + find + " found at position " + rtnVal);
        }
    }


    public static int binarySearch(int[] arr, int find, int arrLength){
        int start = 0;
        int end = arrLength-1;

        while (start <= end) {
            // Here we can do start + (end - start)/2 as may be sun of start and end out of integer length
            int mid = (start + end)/2;
            if(find == arr[mid]){
                return mid;
            }else if (arr[mid] > find){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}
