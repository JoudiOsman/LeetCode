class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;
        
        int max =0;
        int curLen =0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        while (right<s.length()){
            char c = s.charAt(right);
            curLen++;
            
            while(map.containsKey(c)){
                char lC = s.charAt(left);
                map.remove(lC);
                left++;
                curLen--;
            }
            if(curLen>max){
                max = curLen;
            }
            map.put(c,1);
            right++;
        }
        return max;
    }
}
//https://leetcode.com/problems/longest-substring-without-repeating-characters/