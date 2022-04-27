public class LinkedList{
    ListNode head;
    protected class ListNode{
        int data;
        ListNode next;
        ListNode(){}
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty() {
        return head==null;
    }

    public void addAtBeginning(int item) {
        ListNode newListNode=new ListNode(item);
        if (!isEmpty()){
            newListNode.next=head;
            head=newListNode;
        }else{
            head = newListNode;
        }
    }
    public void addAtEnd(int item) {
        ListNode newListNode=new ListNode(item);
        if (!isEmpty()){
            ListNode cur=head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=newListNode;
        }else{
            head=newListNode;
        }
    }
    public int size() {
        int count=0;
        if(!isEmpty()){
            ListNode ListNode=head;
            while (ListNode.next!=null){
                count++;
                ListNode=ListNode.next;
            }
            count++;
        }else{
            count=0;
        }
        return count;
    }


    public void add(int item) {
        ListNode ListNode=new ListNode(item);
        if (isEmpty()){
            head=ListNode;
        }else{
            ListNode n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=ListNode;
        }
    }


    public void add(int index, int item) {
        ListNode ListNode=new ListNode(item);
        //int count=size();
        if(!isEmpty()){
            ListNode n=head;
            for(int i=1;i<size();i++){
                ListNode m;
                if(i==index){
                    m=n.next.next;
                    n.next=ListNode;
                    ListNode.next=m;
                }else{
                    n=n.next;
                }
            }
        }else{
            System.out.println("List is Empty");
        }

    }


    public void remove(int index) {
        //ListNode ListNode=new ListNode();
        if(!(index>size())){
            if (!isEmpty()){
                ListNode n=head;
                if(index==1){
                    head=n.next;
                }else{
                    for(int i=2;i<=index;i++){
                        if(i==index){
                            if(n.next==null){
                                n=null;
                            }else if(n.next.next==null) {
                                n.next=null;
                            }else{
                                n.next=n.next.next;
                            }
                        }else{
                            n=n.next;
                        }
                    }
                }

            }
        }else{
            System.out.println("Index out of Bound");
        }
    }




    public LinkedList duplicate() {
        ListNode n=head;
        LinkedList same=new LinkedList();
        while (n.next!=null){
            same.add(n.data);
            n=n.next;
        }
        same.add(n.data);
        return same;
    }


    public void show() {
        if(!isEmpty()){
            ListNode ListNode=head;
            while (ListNode.next!=null){
                System.out.print(ListNode.data+" ");
                ListNode=ListNode.next;
            }
            System.out.println(ListNode.data);
        }else{
            System.out.println("List is empty");
        }
    }
}
