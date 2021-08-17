/*
row = person
col = bank account
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int row=0; row < accounts.length; row++){
            int row_sum = 0;  // single person wealth sum
            for (int col=0; col < accounts[row].length; col++){
                row_sum += accounts[row][col];
            }
            // check if wealth is less than max wealth
            if (row_sum > max){
                max = row_sum;
            }
        }
        return max;
    }
}