class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = {-1, -1};
        // check for first occurance
        int start = search(nums, target, true);
        // check for last occurance
        int end = search(nums, target, false);
        
        // update result
        result[0] = start;
        result[1] = end;
        
        return result;
    }
    
    public int search(int[] nums, int target, boolean startIndex){
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;  // optimal

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                // actual ans found
                result = mid;
                if (startIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        // not found
        return result;
    }
}