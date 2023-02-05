class Solution {
    public void sortColors(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}