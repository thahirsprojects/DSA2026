package searching;

public class FindMinimumAndMaximum {
    public static void main(String[] args) {
        int[] arr = {32, 44, 76, 22, 45, 67};
        System.out.println("MAX : " + findMin(arr));
        System.out.println("MIN : " + findMax(arr));
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }

        return max;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }

        return min;
    }
}
