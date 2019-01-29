package com.leetcode.array;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wk
 * Date: 2019-01-29 5:05 PM
 */
public class AddTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode now = null;
        int preSum = 0;
        do{
            int sum  = (l1!=null?l1.val:0)+(l2!=null?l2.val:0)+preSum;
            preSum=sum/10;
            sum=sum%10;
            if (root==null){
                root = new ListNode(sum);
                now = root;
            }else{
                now.next = new ListNode(sum);
                now  = now.next;
            }
            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        while (l1!=null||l2!=null);
        if (preSum>0){
            now.next = new ListNode(preSum);
        }
        return root;
    }
}
