class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        Arrays.sort(nums);
        int supposesum = 0;
        int currentsum = 0;
        for(int i=0;i<range+1;i++){
           supposesum = supposesum + i;
        }
        for(int i=0;i<range;i++){
            currentsum += nums[i];
        }
        return supposesum-currentsum;
    }
}