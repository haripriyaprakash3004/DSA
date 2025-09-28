import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> dque = new ArrayDeque<>();
        for(int ele : nums){
            dque.addLast(ele);
        }
        for(int i=0;i<k;i++){
            int ele = dque.removeLast();
            dque.addFirst(ele);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = dque.removeFirst();
        }
    }
}