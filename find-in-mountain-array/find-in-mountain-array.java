/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        // check in first half
        int firstHalf = search(mountainArr, target, 0, peak);
        if (firstHalf != -1){
            return firstHalf;
        }
        // check in second half
        return search(mountainArr, target, peak+1, mountainArr.length()-1);
        
    }
    
    public int findPeak(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
        
        while (start != end){
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid+1)){
                // it means you are descending
                end = mid;
            } else {
                // you are ascending
                start = mid + 1;
            }
        }
        // start == end means it is largest num
        return start;
    }
    
    public int search(MountainArray arr, int target, int start, int end){
        // find whether array is sorted in ascending or descending order
        boolean isAsc = arr.get(end) > arr.get(start);

        while (start <= end){
            int mid = start + (end - start) / 2;  // optimal

            if (arr.get(mid) == target){
                return mid;
            }

            // if array is asceding
            if (isAsc){
                if (target < arr.get(mid)){
                    end = mid - 1;
                } else if (target > arr.get(mid)){
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)){
                    end = mid - 1;
                } else if (target < arr.get(mid)){
                    start = mid + 1;
                }
            }
        }
        // not found
        return -1;
    }
}