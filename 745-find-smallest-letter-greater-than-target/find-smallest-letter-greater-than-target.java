class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length-1;
        char result = 97;
        int flag = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(letters[mid] > target){
                result = letters[mid];
                high = mid-1;
                flag = 1;
            }
            else{
                low = mid+1;
            }
        }
        return flag == 1?result:letters[0];
    }
}