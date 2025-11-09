class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxlen = 0 ;
        // for(int i=0;i<s.length();i++){
        //     HashMap<Character,Boolean> map = new HashMap<>();
        //     int currentlen = 0;
        //     for(int j=i;j<s.length();j++){
        //         char c = s.charAt(j);
        //         if(map.containsKey(c)){
        //             break;
        //         }
        //         map.put(c,true);
        //         currentlen++;
        //         maxlen = Math.max(maxlen,currentlen);
        //     }
        // }
        // return maxlen;

       int left = 0;
       int right = 0;
       int maxlen = 0;
       HashSet<Character> set = new HashSet<>();
       while(right < s.length()){
        char c = s.charAt(right);
        while(set.contains(c)){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(c);
        maxlen = Math.max(maxlen,right-left+1);
        right++;
       }
       return maxlen;
    }
}