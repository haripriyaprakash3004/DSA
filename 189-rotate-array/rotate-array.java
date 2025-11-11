import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> dque = new ArrayDeque<>();
        for(int ele : nums){
            dque.addLast(ele);
        }
        for(int i=0;i<k;i++){
            int num = dque.removeLast();
            dque.addFirst(num);
        }
        for(int j=0;j<nums.length;j++){
            nums[j] = dque.removeFirst();
        }

    }
}