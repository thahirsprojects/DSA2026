package searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,11,23,24,25,26,35,47};
        int target = 35;
        System.out.println(binarySearch(arr, target));

    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
