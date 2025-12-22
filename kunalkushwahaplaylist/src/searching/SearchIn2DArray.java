package searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {23, 43, 23, 54},
                {2, 45, 74, 45},
                {43, 34, 231, 56}
        };
        int target = 74;
        int[] resultIndex = searchElement(twoDArray, target);
        if(resultIndex != null){
            System.out.println(Arrays.toString(resultIndex));
        }
        else {
            System.out.println("Element not found!");
        }
    }

    private static int[] searchElement(int[][] twoDArray, int target) {

        if(twoDArray.length == 0) return null;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if(twoDArray[i][j] == target) return new int[] {i, j};
            }
        }

        return null;
    }
}
