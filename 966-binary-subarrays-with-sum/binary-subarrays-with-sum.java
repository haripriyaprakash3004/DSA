class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int count = 0;
        // int sum = 0;
        // // int max = Integer.MIN_VALUE;
        // // if(nums.length == 1 && nums[0] == goal){
        // //     return goal;
        // // }
        // for(int i=0;i<nums.length;i++){
        //     sum = 0;
        //     for(int j=i;j<nums.length;j++){
        //         sum = sum + nums[j];
        //         if(sum == goal){
        //             count++;
        //         }
        //     }
        // }
        //     // int ele = 0;
        //     // if(count == 0){
        //     //     ele = (int)nums.length * (nums.length+1)/2;
        //     //     return ele;
        //     // }
        
        // return count;

        return atMost(nums,goal) - atMost(nums,goal-1);
    }
    public int atMost(int nums[],int goal){
        if (goal < 0) return 0;
        int left = 0;
        int sum = 0;
        int count = 0;
        for(int right=0;right<nums.length;right++){
            sum += nums[right];

            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            count += (right-left+1);
        }
        return count;

    }
}