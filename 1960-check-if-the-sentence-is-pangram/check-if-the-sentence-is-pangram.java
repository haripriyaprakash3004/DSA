class Solution {
    public boolean checkIfPangram(String sentence) {
        int freq[] = new int[26];
        for(int i=0;i<sentence.length();i++){
            int ele = (int)(sentence.charAt(i) - 97);
            freq[ele]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true;
    }
}