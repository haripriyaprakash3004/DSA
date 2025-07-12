class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        int low = 0;
        int high = nums.length-1;
        int index = 0;
        int first = -1;
        int second = -1;
        while(low < nums.length){
            if(nums[low] == target){
                first = low;
                index++;
                break;
            }
            low++;
        }
          while(high >= 0){
            if(nums[high] == target){
                second = high;
                break;
            }
            high--;
        }
        arr[0] = first;
        arr[1] = second;
        return arr;
    }
}