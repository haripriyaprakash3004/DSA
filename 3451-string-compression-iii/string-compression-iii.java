class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<word.length();i++){
            int count = 1;
            while(i<word.length()-1 && word.charAt(i) == word.charAt(i+1) && count < 9){
                i++;
                count++;
            }
            result.append(count);
            result.append(word.charAt(i));
        }   
        return result.toString();
    }
}