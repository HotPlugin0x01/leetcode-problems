class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x/2;
        int ans = 0;
        if (x == 1)
            return 1;
        
        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if ((long)mid * mid <= x){ 
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
