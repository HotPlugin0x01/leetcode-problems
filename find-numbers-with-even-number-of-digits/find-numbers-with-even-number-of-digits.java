/*
Divide the problem.
*/
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    
    public boolean even(int num){
        int digits = numofDigits(num);
        return (digits % 2 == 0);
    }
    
    public int numofDigits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        
        return count;
    }
    
    
}