class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int Onescount = 0;
        for(int ele : nums){
            if(ele == 1){
                Onescount++;
            }
            else if(ele == 0){
                Onescount = 0;
            }
             max = Math.max(max,Onescount);
        }
        return max;
    }
}