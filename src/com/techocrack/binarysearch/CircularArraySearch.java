package com.techocrack.binarysearch;

import java.util.Scanner;

public class CircularArraySearch {
    public static void main(String[] args) {
        int[] arr = {43, 53, 63, 1, 2, 4, 19, 23, 34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to search:");
        int find  = sc.nextInt();
        int result = rotationArraySearch(arr, arr.length,find);
        System.out.println("number"+ find +" found at : "+result);
    }


    public static int rotationArraySearch(int[] arr, int n, int find){
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = (start + end)/2;
            if(find == arr[mid])
                return mid;
            if(arr[mid] <= arr[end]){
                if(find > arr[mid] && find <= arr[end])
                    start =mid +1;
                else
                    end = mid -1;
            }
            else {
                if(arr[start] <= find && find < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
