public class OddEvenLinkedList extends LinkedList{
    private LinkedList even=new LinkedList();
    private LinkedList odd=new LinkedList();
    public void addevenOdd(LinkedList l1){
        if(!l1.isEmpty()){
            ListNode cur=l1.head;
            while (cur.next!=null){
                if(cur.data%2==0) {
                    even.add(cur.data);
                }else{
                    odd.add(cur.data);
                }
                cur=cur.next;
            }
            if(cur.data%2==0) {
                even.add(cur.data);
            }else{
                odd.add(cur.data);
            }
        }else {
            System.out.println("List is empty");
        }
    }
}
