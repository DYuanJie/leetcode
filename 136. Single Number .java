/*
136. Single Number 
Given an array of integers, every element appears twice except for one. Find that single one.
异或，两数相等时为0
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n : nums){
            result ^= n; 
        }
        return result;
        
    }
}