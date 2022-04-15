class Solution {
    public boolean isPalindrome(int x) {
        int newX = x;
        String str = "";
        if(x<0){
            return false;
        }
        while(newX!=0){
            int popped = newX%10;
            newX/=10;
            char cPop = (char)(popped+48);
            str=str+cPop;
        }
        String str2 = new StringBuilder(str).reverse().toString();
                    System.out.println(str+"+"+str2);
        if(str.equals(str2)){
            return true;
        }
     return false;   
    }
}
//https://leetcode.com/problems/palindrome-number