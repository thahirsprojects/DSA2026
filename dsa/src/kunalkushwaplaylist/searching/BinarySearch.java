package kunalkushwaplaylist.leetcode.searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 11, 23, 24, 25, 26, 35, 47};
        int target = 35;
        System.out.println(binarySearch(arr, target));

        int[] arr2 = {76, 34, 23, 11, 6, 2, 1};
        int target2 = 6;
        System.out.println(binarySearchForDesc(arr2, target2));

        int[] arr3 = {76, 34, 23, 11, 6, 2, 1};
        int target3 = 1;
        System.out.println(binarySearchAgnostic(arr3, target3));

    }

    private static int binarySearchAgnostic(int[] arr3, int target3) {
        int low = 0, high = arr3.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr3[mid] == target3) return mid;

            if(arr3[low] < arr3[high]){
                if (arr3[mid] < target3) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            else{
                if (arr3[mid] > target3) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;

    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchForDesc(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


}
