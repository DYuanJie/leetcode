public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
    	int max = 0;
    	int head = 0;
    	String subStr = "";
    	for(int i = 1; i < s.length(); i++){
    		subStr = s.substring(head, i);
    		if(subStr.indexOf(s.charAt(i)) > -1){
    			head = subStr.indexOf(s.charAt(i))+head+1;
    		}
    		max = Math.max(max, i-head+1);
    	}
    	
       return max;
    }
}