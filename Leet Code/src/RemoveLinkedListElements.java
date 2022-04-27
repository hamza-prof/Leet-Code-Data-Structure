import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> set=new ArrayList<>();
        if(head!=null){
            while (head!=null){
                set.add(head.val);
                head=head.next;
            }
        }
        ListNode cur=null;
        for(int i:set){
            ListNode node=new ListNode(i);
            if(i==val){
                if(head==null){
                    head=node;
                    cur=head;
                }else{
                    cur.next=node;
                    cur=cur.next;
                }
            }
        }
        return head;
    }
}
