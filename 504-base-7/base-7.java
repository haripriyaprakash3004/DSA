class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Boolean check = false;
        if(num < 0){
            num = num*(-1);
            check = true;
        }
        while(num != 0){
            int rem = num % 7;
            sb.append(Integer.toString(rem));
            num = (int)num/7;
        }
        if(check){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}