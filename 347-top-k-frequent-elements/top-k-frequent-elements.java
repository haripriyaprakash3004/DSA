class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[] = new int[k];
        int p = 0;
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,Collections.reverseOrder(Map.Entry.comparingByValue()));
            for(Map.Entry<Integer,Integer> ele : list){
                arr[p++] = ele.getKey();
                if(p == k) break;
            }
        return arr;
    }
}