/*
485. Max Consecutive Ones 
Given a binary array, find the maximum number of consecutive 1s in this array.
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
    }
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int res = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(res < max){
                    res = max;
                   
                }
                 max = 0;
                
            }else{
                max++;
            }
        }
        return res < max ? max : res;
    }
}