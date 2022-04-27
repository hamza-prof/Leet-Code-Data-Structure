import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
        while (headA!=null || headB!=null){
            if(headA!=null){
                if(!set.add(headA)) return headA;
                headA=headA.next;
            }
            if(headB!=null){
                if(!set.add(headB)) return headB;
                headB=headB.next;
            }
        }
        return null;
    }
}
