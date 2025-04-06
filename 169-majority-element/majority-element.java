class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int max = 0;
       for(int num : nums){
        if(count == 0){
            max = num;
            count++;
        }
        else if(max == num){
            count++;
        }
        else{
            count--;
        }
       }
       return max;
    }
}