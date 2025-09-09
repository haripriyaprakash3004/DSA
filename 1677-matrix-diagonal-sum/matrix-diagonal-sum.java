class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;
        int j=0;
        int m = mat.length;
        int n = mat[0].length;
        int sum = 0;
        while(i<m && j<n){
            sum = sum + mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j = mat.length-1;
        while(i<m && j>=0){
            sum = sum + mat[i][j];
            i++;
            j--;
        }
        if(mat.length % 2 == 1){
            sum = sum - mat[(int)mat.length / 2][(int)mat.length / 2];
        }
        return sum;
    }
}