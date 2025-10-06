class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length-1];
        int minSum = Integer.MAX_VALUE;
        int ele = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                sum += (int)Math.ceil((double)nums[i]/mid);
            }
            // minSum = Math.min(sum,minSum);
            if(sum > threshold){
                low = mid+1;
            }
            else if(sum <= threshold){
                ele = mid;
                high = mid-1;
            }
        }
        return ele;
    }
}