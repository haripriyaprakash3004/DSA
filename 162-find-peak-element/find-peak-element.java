class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            long left = (i-1 >= 0) ? nums[i-1] : Long.MIN_VALUE;
            long right = (i+1 < n) ? nums[i+1] : Long.MIN_VALUE;
            if(left < nums[i] && right < nums[i]){
                return i;
            }
        }
        return -1;
    }
}