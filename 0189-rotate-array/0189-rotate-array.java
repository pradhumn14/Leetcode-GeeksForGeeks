class Solution {
    public void rotate(int[] nums, int k) {
        rotateArray(nums, k);
    }
    
    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        int n = arr.length;
        reverse(arr, 0, n - k - 1); //last n-k elements ko revrese kiya
        reverse(arr, n - k, n - 1); //last k elements ko kiya
        reverse(arr, 0, n - 1); //whole array reverse
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}