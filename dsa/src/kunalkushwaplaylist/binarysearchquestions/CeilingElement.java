package kunalkushwaplaylist.binarysearchquestions;

public class CeilingElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 7;
        System.out.println(findCeilingElement(arr, target));
    }

    private static int findCeilingElement(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ceiling = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ceiling = arr[mid];     // possible answer
                high = mid - 1;         // search left for smaller ceiling
            } else {
                low = mid + 1;          // search right
            }
        }
        return ceiling;
    }
}
