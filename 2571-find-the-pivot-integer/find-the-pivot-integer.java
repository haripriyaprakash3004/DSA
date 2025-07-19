class Solution {
    public int pivotInteger(int n) {
        int leftsum = 0;
        int rightsum = 0;
        for(int i=1;i<=n;i++){
           if(i>0) leftsum = leftsumele(i-1);
           rightsum = rightsumele(n,i+1);
           if(leftsum == rightsum){
            return i;
           }
        }
        return -1;
    }
    int leftsumele(int left){
        int sum = 0;
        for(int i=1;i<=left;i++){
            sum = sum + i;
        }
        return sum;
    }
    int rightsumele(int n,int right){
        int sum = 0;
        for(int i=right;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }

}