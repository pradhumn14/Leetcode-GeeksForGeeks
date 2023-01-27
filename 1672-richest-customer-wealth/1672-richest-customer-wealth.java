class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            
            int customerSum = 0;
            
            for (int j = 0; j < accounts[i].length; j++) {
                customerSum += accounts[i][j];
            }
            
            if (maxWealth < customerSum) {
                maxWealth = customerSum;
            }
            
        }
        
        return maxWealth;
        
    }
}