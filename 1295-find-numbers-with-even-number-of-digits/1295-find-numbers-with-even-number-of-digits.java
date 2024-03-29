class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(even(num)) {
                count++;
            }
        }
        
        return count;
    }
    
    // function to check whether a number contains even digits or not
    
    boolean even(int num) {
        
        int numberOfDigits = digits(num);
        
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        
        return false;
        
        
    }
    
    // count digits of a number

    int digits(int num) {
        
        if (num < 0) {
            num = num * -1;
        }
        
        return (int) (Math.log10(num)) + 1;
        
//         if (num == 0) {
//             return 1;
//         }
        
//         int count = 0;
        
//         while ( num != 0) {
//             count++;
//             num /= 10;
//         }
        
//         return count;
    }
    
    
    
}