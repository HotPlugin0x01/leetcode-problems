class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int idx = 0;
        
        for (int i = 0; i < nums.length; i+=2){
            arr[i] = nums[idx];
            arr[i+1] = nums[idx+n];
            idx++;
        }
        return arr;
    }
}