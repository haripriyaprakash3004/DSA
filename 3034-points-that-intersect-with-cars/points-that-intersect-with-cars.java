class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for(List<Integer> pair : nums){
            int start = pair.get(0);
            int end = pair.get(1);
            for(int i=start;i<=end;i++){
                set.add(i);
            }
        }
        return set.size();
    }
}