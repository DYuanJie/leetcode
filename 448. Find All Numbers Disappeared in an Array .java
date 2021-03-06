/*
448. Find All Numbers Disappeared in an Array 
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
把已有的数作为下标，将相应的数取反，为正的数的下标就是缺少的

*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){ 
            if(nums[Math.abs(nums[i])-1] > 0) nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                result.add(i+1);
        }
        return result;
    }
}