package kunalkushwaplaylist.leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {34, 4, 2342, 435, 2345, 3, 3456};
        System.out.println(findEvenDigits(nums));
    }

    private static int findEvenDigits(int[] nums) {
        int count = 0;

        for(int n : nums){
            if(isEvenDigit(n)) count++;
        }

        return count;
    }

    private static boolean isEvenDigit(int n) {
        int digitCount = 0;
        while(n > 0){
            n /= 10;
            ++digitCount;
        }

        if(digitCount % 2 == 0) return true;

        return false;
    }
}
