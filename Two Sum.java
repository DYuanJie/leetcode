public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> num = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(num.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = num.get(target - nums[i]);
            }
            num.put(nums[i], i);
        }
        return result;
    }
}