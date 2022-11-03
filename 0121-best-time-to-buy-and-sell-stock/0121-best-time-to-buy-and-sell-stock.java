class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int totalProf = 0;
        int currProf = 0;
        
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
        }
            
            currProf = prices[i] - min;
            if(totalProf < currProf){
                totalProf = currProf;
            }
        }
        return totalProf;
        
    }
}