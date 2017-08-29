/**
 * Given two integers x and y, calculate the Hamming distance.
 * 
 *�������ַ�������������㣬��ͳ�ƽ��Ϊ1�ĸ�������ô��������Ǻ������롣
 *���������return Integer.bitCount(x ^ y);
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