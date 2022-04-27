public class ListNode {
     int val;
     ListNode next;
     ListNode prev;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode(int val, ListNode next,ListNode prev) { this.val = val; this.next = next; this.prev = prev; }
}

