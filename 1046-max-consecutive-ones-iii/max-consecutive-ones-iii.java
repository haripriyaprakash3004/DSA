class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int countOfZeros = 0;
        int maxlen = 0;
        while(end < nums.length){
            if(nums[end++] == 0){
                countOfZeros++;
            }
            while(countOfZeros > k){
                if(nums[start] == 0){
                    countOfZeros--;
                }
                start++;
            }
            maxlen = Math.max(maxlen,(end-start));
        }
        return maxlen;
    }
}