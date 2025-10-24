class Solution {
    public String longestPalindrome(String s) {
        StringBuilder str1 = new StringBuilder(s.substring(0, 1));
        int max = 1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1 > max){
                        max = j-i+1;
                        str1 = new StringBuilder(s.substring(i,j+1));
                    }
                }
            }
        }
        return str1.toString();
    }
    public boolean isPalindrome(String str,int start,int end){
        int left = start;
        int right = end;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}