class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        for(int i=0;i<nums.length;i++){
            if(i > 0) leftsum = leftsumarray(nums,i-1);
            rightsum = rightsumarray(nums,i+1);
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
    int leftsumarray(int nums[],int left){
        int sum =0;
        for(int i=0;i<=left;i++){
            sum = sum+nums[i];
        }
        return sum;
    }
    int rightsumarray(int nums[],int right){
        int sum =0;
        for(int i=right;i<=nums.length-1;i++){
            sum = sum+nums[i];
        }
        return sum;
    }
}