/*
540. Single Element in a Sorted Array 
Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once. 
Input: [1,1,2,3,3,4,4,8,8]
Output: 2
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length-1; i += 2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        if(nums.length % 2 != 0){
            result = nums[nums.length-1];
        }
        return result;
    }
}