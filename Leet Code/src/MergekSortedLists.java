import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        ListNode head=null;
        ListNode cur=null;
        for(ListNode i:lists){
           if(i!=null){
               while (i.next!=null){
                   list.add(i.val);
                   i=i.next;
               }
               list.add(i.val);
           }
        }
        Collections.sort(list);
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
