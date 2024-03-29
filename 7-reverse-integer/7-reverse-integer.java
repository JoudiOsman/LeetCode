class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while(x!=0){
            int curInt = x%10;
            x/=10;

            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && curInt > 7)){
                return 0;
            } 
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && curInt < -8)){
                return 0;
            }   
            reversed*=10;
            reversed+=curInt;
        }

        return reversed;  
    }
}
//https://leetcode.com/problems/reverse-integer/