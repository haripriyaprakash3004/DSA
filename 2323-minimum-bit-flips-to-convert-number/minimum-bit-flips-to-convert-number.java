class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        int count = 0;
        ans = start ^ goal;
        for(int i=0;i<32;i++){
            if((ans & (1<<i)) != 0){
                count = count + 1;
            }
        }
        return count;
    }
}