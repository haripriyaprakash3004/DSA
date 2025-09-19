class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0 ;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Boolean> map = new HashMap<>();
            int currentlen = 0;
            for(int j=i;j<s.length();j++){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    break;
                }
                map.put(c,true);
                currentlen++;
                maxlen = Math.max(maxlen,currentlen);
            }
        }
        return maxlen;
    }
}