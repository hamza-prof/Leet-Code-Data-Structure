/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
   ListNode head=new ListNode(0);
   ListNode result=head;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        int carry=0;
        while (l1 != null || l2!=null || carry!=0){
            sum=0;
            if (l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            result.next=new ListNode(sum%10);
            result=result.next;
        }
        return head.next;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println(sol.addTwoNumbers(new ListNode(7),new ListNode(4)).val);

    }
}