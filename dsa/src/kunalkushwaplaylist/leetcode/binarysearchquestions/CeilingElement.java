package kunalkushwaplaylist.leetcode.binarysearchquestions;

public class CeilingElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 7;
        System.out.println(findCeilingElement(arr, target));
    }

    private static int findCeilingElement(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int min = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            int ans = -1;

            if(arr[mid] >= target){
                ans = arr[mid];
                high  = mid - 1;

            }
            else{
                high = mid - 1;
            }
        }
        return min;
    }


}
