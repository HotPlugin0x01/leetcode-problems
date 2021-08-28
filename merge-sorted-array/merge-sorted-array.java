class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int total = n + m;
		
        for(int i = 0; i < n; i++) {
            nums1[total-i-1] = nums2[i];
        }
        bubbleSort(nums1);
    }
    // Using bubble sort
    public void bubbleSort(int[] arr){
        boolean swapped; 
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step, max item will come at them last respective index
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if swapped is false then it means array is already sorted so break the loop
            if (!swapped){
                break;
            }
        }
    }
}