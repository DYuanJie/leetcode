/*
442. Find All Duplicates in an Array 
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?
不在乎空间复杂度时:
 Set set = new HashSet();
        List<Integer> result = new ArrayList<Integer>();
        int size = 0;
        for(int i : nums){
            set.add(i);
            if(set.size() != size+1){
                result.add(i);
            }else{
                size++;
            }
        }
        return result;
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i : nums){
            int location = Math.abs(i)-1;
            if(nums[location] < 0){
                result.add(location+1);
            }else{
                nums[location] = -nums[location];
            }
        }
        return result;
    }
}