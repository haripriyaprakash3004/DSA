class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        Queue<Character> sque = new LinkedList<>();
        Queue<Character> gque = new LinkedList<>();
        for(char c:s.toCharArray()){
            sque.add(c);
        }
        for(char c:goal.toCharArray()){
            gque.add(c);
        }
        for(int i=0;i<s.length();i++){
            if(sque.equals(gque)){
                return true;
            }
            sque.add(sque.remove());
        }
        return false;
    }
}