/*
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array. 
Example:
For num = 5 you should return [0,1,1,2,1,2]. 
hint中提示，注意2-3,4-7,8-15的区间规律。分别是1、2，1、2、2、3，1、2、2、3、2、3、3、4.
成倍数关系的几位不变，后几位分别加1.f(i) = f(i/2)+i%2
*/

public class Solution {
    public int[] countBits(int num) {
        int count[] = new int[num+1];
        for(int i = 0; i <= num; i++){
           count[i] = count[i/2] + i%2;
        }
        return count;
    }
}