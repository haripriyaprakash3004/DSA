class Solution {
    public int maxScore(String s) {
        int rightCount = 0;
        int leftCount = 0;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i=1;i<=s.length()-1;i++){
            String left = s.substring(0,i);
            String right = s.substring(i,s.length());
            leftCount = zeros(left);
            rightCount = ones(right);
            total = leftCount + rightCount;
            max = Math.max(total,max);
        }
        return max;
    }
    int zeros(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                count++;
            }
        }
        return count;
    }
    int ones(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}