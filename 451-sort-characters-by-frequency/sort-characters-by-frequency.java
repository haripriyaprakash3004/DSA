class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> que = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );
        que.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!que.isEmpty()){
            char cur = que.poll();
            int count = map.get(cur);
            for(int i =0;i<count;i++){
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}