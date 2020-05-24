package com.techocrack.search;

public class BinarySearch {
    //time complexity is O(n)
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 19, 34, 43, 23, 53};
        int find = 43;
        int rtnVal = binarySearch(arr, find, arr.length);
        if(rtnVal == -1){
            System.out.println("Value is not there in array");
        }else{
            System.out.println(""+find+" found at position "+ rtnVal);
        }

    }

    public static int binarySearch(int[] arr, int find, int arrLength){
        for(int i=0; i<arrLength-1; i++){
            if(arr[i] == find){
                return i;
            }
        }
        return -1;
    }
}
