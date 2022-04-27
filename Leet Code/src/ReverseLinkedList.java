public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur;
        ListNode temp;
        if(head!=null){
            temp=head;
            while (temp!=null){
                cur=temp;
                temp=temp.next;
                cur.next=pre;
                pre=cur;
                head=cur;
            }
        }
        return head;
    }
}
