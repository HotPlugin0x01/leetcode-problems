class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        // first element is same
        sum[0] = nums[0];
        // start from 1
        for (int i=1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}