public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode cur,prev;
        if(head!=null && head.next!=null){
            cur=head;
            prev=head;
            while (cur!=null){
                ListNode temp=cur.next;
                if(temp!=null){
                    prev.next=temp.next;
                    temp.next=prev;
                    cur= prev.next;
                }
                cur=cur.next;
            }
        }
        return head;
    }
}
//GOOGLE SOLUTION
/*if(head == null || head.next == null)
            return head;
        //initialise the prevNode
        ListNode prevNode = new ListNode(-1) , prehead = prevNode;
        prevNode.next = head;
        ListNode first , second , temp;
        //temporary variable to store first and second of every pair
        while(head != null && head.next != null)
        {
            first = head;
            second = head.next;
            temp = second.next;
            second.next = first;
            prevNode.next = second;
            //connecting previous node to the second of this pair
            prevNode = first;
            head = temp;
            //reinitialising previous node and head for next pair
        }
        prevNode.next = head;
        return prehead.next;*/