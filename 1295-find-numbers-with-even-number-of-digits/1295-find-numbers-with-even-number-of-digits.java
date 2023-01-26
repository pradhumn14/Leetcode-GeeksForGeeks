class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }

        return count;
    }
    
    boolean even(int num) {

        int numberOfDigits = digits(num);

        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */

        return numberOfDigits % 2 == 0;

    }
    
    int digits(int num) {

        if (num < 0) {
            num = num * - 1;
        }
        
        return (int) (Math.log10(num)) + 1;
    }
    
}