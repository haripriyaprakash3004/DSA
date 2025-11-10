class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            int ele = n;
            int sum = 0;
            while(ele != 0){
                int rem = ele % 10;
                sum += rem * rem;
                ele =(int)ele/10;
            }
            n = sum;
        }
        return n==1;
    }
}