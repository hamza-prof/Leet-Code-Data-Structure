import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list=new ArrayList<>();
        ListNode head=null;
        ListNode cur=null;
        if(list1!=null){
            cur=list1;
            while (cur.next!=null){
                list.add(cur.val);
                cur=cur.next;
            }
            list.add(cur.val);
        }
        if(list2!=null){
            cur=list2;
            while (cur.next!=null){
                list.add(cur.val);
                cur= cur.next;
            }
            list.add(cur.val);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ListNode node=new ListNode(list.get(i));
            if (head==null){
                head=node;
                cur=head;
            }else{
                cur.next=node;
                cur=cur.next;
            }
        }
        return head;
    }
}
