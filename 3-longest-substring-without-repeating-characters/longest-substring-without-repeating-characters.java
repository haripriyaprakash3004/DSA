class Solution {
    public int lengthOfLongestSubstring(String s) {
            int maxlen = 0;
            for(int i=0;i<s.length();i++){
                HashMap<Character,Boolean> map = new HashMap<>();
                int currentlen = 0;
                for(int j=i;j<s.length();j++){
                    char ch = s.charAt(j);
                    if(map.containsKey(ch)){
                        break;
                    }
                    map.put(ch,true);
                    currentlen++;
                    maxlen = Math.max(maxlen,currentlen);
                }
            }
        
        return maxlen;
    }
}