/*Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
这道题求一个特殊的补码。Integer.highestOneBit(num)得到原数最高位，左移1位减1，得到一串fffff，为num的掩码，与num做异或操作，即可得到补码
2017/5/27
*/

public class Solution {
    public int findComplement(int num) {
        return num ^ ((Integer.highestOneBit(num) <<1) - 1);
    }
}