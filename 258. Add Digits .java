/*
258. Add Digits 
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 
方法一：逐位相加。
方法二：规律。
1 2 3 4 5 6 7 8 9 10 11 12 13 14
1 2 3 4 5 6 7 8 9 1  2  3  4  5
num = num % 9;
*/
class Solution {
    public int addDigits(int num) {
        while(num > 9){
            num = num/10 + num%10;
        }
        return num;
        
    }
}