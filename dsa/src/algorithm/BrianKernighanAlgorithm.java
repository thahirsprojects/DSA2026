package algorithm;

public class BrianKernighanAlgorithm {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(findHammingWeight(n));
    }

    private static int findHammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n - 1);
            count++;
        }
        return count++;
    }
}
