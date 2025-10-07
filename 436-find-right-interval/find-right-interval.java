class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int result[] = new int[intervals.length];
        // Arrays.fill(result,-1);
        for(int k=0;k<intervals.length;k++){
            int ele = intervals[k][1];
            int bestindex = -1;
            int bestStart = Integer.MAX_VALUE;
            for(int i=0;i<intervals.length;i++){
                if(intervals[i][0] >= ele){
                    if(intervals[i][0] < bestStart){
                        bestStart = intervals[i][0];
                        bestindex = i;
                    }
                }
            
            }
            result[k] = bestindex;
        }
        return result;
    }
}