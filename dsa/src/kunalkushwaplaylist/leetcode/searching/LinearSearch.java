package kunalkushwaplaylist.leetcode.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 34, 1, 35, 98, 54, 65};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if(index!=-1){
            System.out.println("Index of the element: " + index);
        }
        else{
            System.out.println("Element not found !");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }

        return -1;
    }
}
