class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            target[i] = list.get(i);
        }
        
        return target;
        
    }
}