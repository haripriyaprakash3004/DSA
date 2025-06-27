class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        long ans = 0;
        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i) == ' ') i++;

        if(i<n && s.charAt(i) == '+'){
            sign = 1;
            i++;
        }
        else if(i<n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }

        while(i<n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';
            ans = ans*10 + digit;

            if(ans > Integer.MAX_VALUE && sign == 1){
                return Integer.MAX_VALUE;
            }
            if(-ans < Integer.MIN_VALUE && sign == -1){
                return Integer.MIN_VALUE;
            }
            i++;
            
        }
        return (int)(sign*ans);
            }
}