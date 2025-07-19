class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftarr[] = new int[nums.length];
        int rightarr[] = new int[nums.length];
        leftarr[0] = 0;
        rightarr[nums.length-1] = 0;
        int leftindex = 0;
        for(int i=1;i<nums.length;i++){
            if(leftindex < nums.length){
            leftarr[i] = leftarr[i-1] + nums[leftindex];
            leftindex++;
            }
        }
        int rightindex = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(rightindex >= 0){
            rightarr[i] = rightarr[rightindex] + nums[rightindex];
            rightindex--;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(leftarr[i]-rightarr[i]);
        }
        return nums;
    }
}