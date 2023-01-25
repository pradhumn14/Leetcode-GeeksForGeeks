class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[] = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length-1; i = i + 2) {
            arr[i] = nums[c];
            arr[i + 1] = nums[c + n];
            c++;
        }
        
        return arr;
        
    }
}