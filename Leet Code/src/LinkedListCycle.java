import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean bool=false;
        HashSet<ListNode> map=new HashSet<>();
        ListNode cur=head;
        while (true){
            bool=map.add(cur);
            cur=cur.next;
            if(!bool){
                bool=true;
                break;
            }
        }
        return bool;
    }
}
