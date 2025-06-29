class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int rindex = cardPoints.length-1;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            lsum = lsum + cardPoints[i];
            maxSum = lsum;
        }
        for(int j=k-1;j>=0;j--){
            lsum =lsum - cardPoints[j];
            rsum = rsum + cardPoints[rindex];
            rindex--;
            maxSum = Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}