class Solution {
    public boolean checkIfPangram(String sentence) {
        String all = "thequickbrownfoxjumpsoverthelazydog";
        
        for (int i=0; i < all.length(); i++){
            // check if all alphas are present in sentence
            if (sentence.indexOf(all.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}