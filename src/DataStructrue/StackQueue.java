package DataStructrue;

public class StackQueue {
    private TwoSidesNode head;
    private TwoSidesNode tail;
    private int size;

    public StackQueue(){
        head=new TwoSidesNode();
        tail=new TwoSidesNode();
        size=0;
        head.next=tail;
        tail.prev=head;
    }

    public boolean IsEmpty(){
        return size==0;
    }

    public void InsertAtFront(TwoSidesNode node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        size++;
        return;
    }

    public void InsertAtLast(TwoSidesNode node){
        node.prev=tail.prev;
        node.next=tail;
        tail.prev.next=node;
        tail.prev=node;
        size++;
        return;
    }

    public Object getFirstElement() throws RuntimeException{
        if(this.IsEmpty()){
            throw new RuntimeException("Empty!");
        }
        return head.next.element;
    }

    public Object getLastElement()throws RuntimeException{
        if(this.IsEmpty()){
            throw new RuntimeException("Empty!");
        }
        return tail.prev.element;
    }

    public Object RemoveFirst()throws RuntimeException{
        if(this.IsEmpty()){
            throw new RuntimeException("Empty!");
        }
        Object tmp=getFirstElement();
        head.next.prev=null;
        head.next=head.next.next;
        head.next.prev.next=null;
        head.next.prev=head;
        return tmp;
    }

    public Object RemoveLast()throws RuntimeException{
        if(this.IsEmpty()){
            throw new RuntimeException("Empty!");
        }
        Object tmp=getLastElement();
        tail.prev.next=null;
        tail.prev=tail.prev.prev;
        tail.prev.next.prev=null;
        tail.prev.next=tail;
        return tmp;
    }

}
