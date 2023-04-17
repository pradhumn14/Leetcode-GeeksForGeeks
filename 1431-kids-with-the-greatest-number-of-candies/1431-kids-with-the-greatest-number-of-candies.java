class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList <Boolean> list = new ArrayList<Boolean>();
        
        int max = candies[0];
        
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            
            if (candies[i] >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
            
        }
        
        return list;
        
    }
}