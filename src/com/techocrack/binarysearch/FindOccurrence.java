package com.techocrack.binarysearch;

import java.util.Scanner;

public class FindOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 19, 23, 23, 26, 43, 53, 63};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to search:");
        int find  = sc.nextInt();
        int firstOcc = firstOccurrence(arr, find, arr.length);
        if (firstOcc == -1) {
            System.out.println("Number " + find +" is not Found");
        } else {
            System.out.println("" + find + " found at first occurrence at position " + firstOcc);
            int lastOcc =  lastOccurrence(arr, find, arr.length);
            System.out.println("No Of occurrence of " +find+" is :" + ((lastOcc - firstOcc) + 1));
        }
    }


    public static int firstOccurrence(int[] arr,int find , int arrLength){
        int start = 0;
        int end = arrLength-1;
        int result = -1;
        while (start <= end) {
            int mid = start  + (end - start)/2;
            if(find == arr[mid]){
                result = mid;
                end = mid - 1;
            }else if (arr[mid] > find){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return result;
    }
    public static int lastOccurrence(int[] arr,int find , int arrLength){
        int start = 0;
        int end = arrLength-1;
        int result = -1;
        while (start <= end) {
            int mid = start  + (end - start)/2;
            if(find == arr[mid]){
                result = mid;
                start = mid + 1;
            }else if (arr[mid] > find){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return result;
    }

    // Refactorto get first and last from same method
    public static int findFirstandLastOccurence(int[] arr, int find, int arrLength, boolean searchfirst){
        int start = 0;
        int end = arrLength-1;
        int result = -1;
        while (start <= end) {
            int mid = start  + (end - start)/2;
            if(find == arr[mid]){
                result = mid;
                if(searchfirst)
                    end = mid -1;
                else
                    start = mid + 1;
            }else if (arr[mid] > find){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return result;
    }
}
