/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode result = new ListNode(0);
      int carry = 0;
      ListNode res = result;
      while(l1 != null || l2 != null){
          if(l1 != null){
              carry += l1.val;
              l1 = l1.next;
          }
          
          if(l2 != null){
              carry += l2.val;
              l2 = l2.next;
          }
          
          result.next = new ListNode(carry%10);
          carry /= 10;
          result = result.next;
      }
      //最后的进位
      if(carry > 0){
          result.next = new ListNode(carry);
          
      }
      return res.next;
        
    }
}