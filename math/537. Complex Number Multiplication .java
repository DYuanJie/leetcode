/*Given two strings representing two complex numbers.
You need to return a string representing their multiplication. Note i2 = -1 according to the definition. 
Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
(a+bi)*(c+di)=ac-bd+(ad+bc)*i

使用String.split()时，加号要转义为\\+
2017/5/27
*/


public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] aa = a.split("\\+");
        String[] bb = b.split("\\+");
        int n1 = Integer.valueOf(aa[0]);
        int n2 = Integer.valueOf(aa[1].substring(0, aa[1].length()-1));
        int n3 = Integer.valueOf(bb[0]);
        int n4 = Integer.valueOf(bb[1].substring(0, bb[1].length()-1));
        
        String result = (n1*n3-n2*n4)+"+"+(n1*n4+n2*n3)+"i";
        return result;
    }
}