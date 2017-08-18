/*
496. Next Greater Element I 
 You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number. 
break: 跳出循环
continue:跳出当前循环
*/
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        Map<Integer, Integer> numss = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            numss.put(nums[i], i);
        }
        
        int index;
        for(int j = 0; j < findNums.length; j++){
            index = numss.get(findNums[j]);
            result[j] = -1;
            for(; index < nums.length; index++){
                if(nums[index] > findNums[j]){
                    result[j] = nums[index];
                    break;
                }
            }
        }
        return result;
        
    }
}