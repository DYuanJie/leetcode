
/*
575. Distribute Candies 
Given an integer array with even length, where different numbers in this array represent different kinds of candies. 
Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. 
Return the maximum number of kinds of candies the sister could gain. 
*/

public class Solution {
    public int distributeCandies(int[] candies) {
        Set spec = new HashSet();
        for(int c : candies){
            spec.add(c);
        }
        int length = candies.length;
        int size = spec.size();
        return length/2 > size ? size : length/2;
    }
}