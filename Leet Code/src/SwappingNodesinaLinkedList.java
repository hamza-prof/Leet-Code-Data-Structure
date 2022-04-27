import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwappingNodesinaLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        int front=0,end=0;
        ListNode cur;
        List<Integer> list=new ArrayList<>();
        if(head!=null){
            cur=head;
            while (cur!=null){
                list.add(cur.val);
                cur=cur.next;
            }
            head=null;
            Collections.swap(list,k-1,(list.size()-1)-k);
            for(int i=0;i<list.size();i++){
                ListNode node=new ListNode(list.get(i));
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
