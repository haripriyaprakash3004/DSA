class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : nums){
            ans.add(num);
        }
        int max = -1;
        while(k != 0){
           max =  ans.poll();
           k--;
        }
        return max;
    }

}