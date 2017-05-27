/**
 * Given two integers x and y, calculate the Hamming distance.
 * 
 *对两个字符串进行异或运算，并统计结果为1的个数，那么这个数就是汉明距离。
 *最简单做法：return Integer.bitCount(x ^ y);
 *2017/05/26
 */

public class Solution {
    public int hammingDistance(int x, int y) {
        int a = x^y;
        int result = 0;
        while(a != 0){
            result += a & 1;
            a = a>>1;
        }
        return result;
    }
}