package kunalkushwaplaylist.leetcode.searching;

public class LinearSearchINRange {
    public static void main(String[] args) {
        int[] arr = {23, 34, 1, 35, 98, 54, 65};
        int start = 2, end = 5;
        int target = 35;
        System.out.println(linearSearchInRange(arr, target, start, end));

    }

    private static boolean linearSearchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) return false;

        for(int i = start; i <= end; i++){
            if(arr[i] == target) return true;
        }

        return false;
    }

}
