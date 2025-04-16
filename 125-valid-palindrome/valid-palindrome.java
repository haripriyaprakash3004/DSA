class Solution {
    public boolean isPalindrome(String s) {
        String valid = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = valid.length()-1;
        return isValidPalindrome(valid,left,right);
    }
    private boolean isValidPalindrome(String s,int left,int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isValidPalindrome(s,left+1,right-1);
    }
}