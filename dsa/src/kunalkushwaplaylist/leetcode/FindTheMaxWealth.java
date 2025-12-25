package kunalkushwaplaylist.leetcode;

public class FindTheMaxWealth {

    //https://leetcode.com/problems/richest-customer-wealth/

    public static void main(String[] args) {
        int[][] acc = {
                {1, 2, 3},
                {2, 3, 4}
        };
        System.out.println(maximumWealth(acc));
    }

    private static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            max = Math.max(max, wealth);
        }

        return max;
    }
}
