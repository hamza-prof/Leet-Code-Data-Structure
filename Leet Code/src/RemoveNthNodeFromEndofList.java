import java.util.ArrayList;
import java.util.Collections;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        ArrayList<Integer> list=new ArrayList<>();
        while (cur.next!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        list.add(cur.val);
        Collections.reverse(list);
        list.remove(n);
        Collections.reverse(list);
        head=null;
        for(int i=0;i<list.size();i++){
            ListNode nod=new ListNode(list.get(i));
            if(head==null){
                head=nod;
                cur=nod;
            }else{
                cur.next=nod;
                cur=cur.next;
            }
        }
        return head;
    }
}
