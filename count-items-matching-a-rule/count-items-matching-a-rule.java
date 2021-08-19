class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIdx = 0;
        switch (ruleKey){
                case "color" -> ruleIdx = 1;
                case "name" -> ruleIdx = 2;
        }
        int count = 0;
        
        for (List<String> item : items){
            if (item.get(ruleIdx).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}