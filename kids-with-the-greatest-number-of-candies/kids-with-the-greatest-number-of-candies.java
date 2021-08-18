/*
First find max
Then compare all
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies){
            if (candy > max){
                max = candy;
            }
        }
        
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int candy : candies){
            ans.add((candy+extraCandies >= max));
        }
        return ans;
    }
}