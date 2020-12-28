package PQueue;

public class ListNode {
    private Object val;
    private ListNode next;

    public ListNode(){
        this(null,null);
    }

    public ListNode(Object val,ListNode next){
        this.val=val;
        this.next=next;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public Object getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }
}
