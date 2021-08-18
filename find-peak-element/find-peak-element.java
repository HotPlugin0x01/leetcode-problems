class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start != end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
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
}