class Solution {
    public int maxCoins(int[] nums) {
        
        int[] arr = new int[nums.length + 2];

        arr[0] = arr[arr.length - 1] = 1;

        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = nums[i - 1];
        }

        return(burst(arr, 0, arr.length - 1));
    }
    
    public static int burst(int[] arr, int si, int ei) {
        int[][] dp = new int[arr.length][arr.length];

        for (int slide = 2; slide < dp.length; slide++) {

            for (int j = slide; j < dp.length; j++) {

                int i = j - slide;
                int ans = Integer.MIN_VALUE;

                for (int k = i + 1; k < j; k++) {

                    int left = dp[i][k];
                    int right = dp[k][j];
                    int self = arr[i] * arr[k] * arr[j];

                    ans = Math.max(ans, self + left + right);

                }

                dp[i][j] = ans;

            }

        }

        return dp[0][dp.length - 1];
    }
    
}