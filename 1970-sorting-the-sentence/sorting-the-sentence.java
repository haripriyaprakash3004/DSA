class Solution {
    public String sortSentence(String s) {
        String word[] = s.split(" ");
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<word.length;i++){
            int lastIndex = word[i].length()-1;
            int intvalue = word[i].charAt(lastIndex) - '0';
            String value = word[i].substring(0,lastIndex);
            map.put(intvalue,value);
        }
        StringBuilder result = new StringBuilder();
        for(int i=1;i<=word.length;i++){
            result.append(map.get(i) + " ");
        }
        return result.toString().trim();
    }
}