class Solution {
    public int maxArea(int[] height) {

        int max = Integer.MIN_VALUE;
        int c = height.length-1;
        int d=0;
        
        while(c!=d){
            if((Math.min(height[c],height[d])*(c-d))>max){
                max = (Math.min(height[c],height[d])*(c-d));            
            }
            if(height[d]>height[c]){
                c--;
            } else{
                d++;
            }
        }
        return max;
        
    }
}
//https://leetcode.com/problems/container-with-most-water