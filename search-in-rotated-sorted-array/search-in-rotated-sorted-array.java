/*
# Solution:
1. Find "Pivot"
2. Search in first half (start, pivot)
3. Search in 2nd half (pivot+1, end)

# Finding Pivot: (Pivot is largest number)
1. When mid > mid+1, Pivot = mid
2. When mid < mid-1, Pivot = mid-1
3. When start >= mid, All elements from mid will be < start
   So, we can ignore these elements since we are looking for peak (pivot).
   Ignore -> end = mid - 1
4. If start < mid, means bigger number lies ahead so -> start = mid + 1
*/

class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);   
        // if -1 means, array not rotated
        if (pivot == -1) { 
            // do normal search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if found means, two asc arrays
        if (nums[pivot] == target) {
            return pivot;
        } else if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }
        
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    
    public int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end){
            int mid = start + (end - start) / 2; 
            // write above defined 4 cases
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            } else if (arr[start] >= arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    
    public int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;  // optimal
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        // not found
        return -1;
    }
}