package com.techocrack.binarysearch;

import java.util.Scanner;

public class ArrayRotationCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 19, 23, 34, 43, 53, 63};
        int rotation = rotationCount(arr, arr.length);
        System.out.println("rotated for "+rotation);
    }


    public static int rotationCount(int[] arr, int n){
        int start = 0;
        int end = n-1;

        while (start <= end) {
            if(arr[start] <= arr[end])
                return start;
            int mid = (start + end)/2;
            int next = (mid+1)%n, prev = (mid+n-1)%n;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
                return mid;
            else if(arr[mid] <= arr[end])
                end = mid -1;
            else if(arr[mid] >= arr[start])
                start = mid +1;
        }
        return -1;
    }
}
