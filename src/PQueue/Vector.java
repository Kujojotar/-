package PQueue;
import java.util.ArrayList;

public class Vector {
    private ListNode head;
    private int size;
    private ArrayList<ListNode> arrayList;

    public Vector(){
        this(null,0);
    }

    public Vector(ListNode head,int size){
        this.head=head;
        this.size=size;
        arrayList=new ArrayList<ListNode>();
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public ListNode rank2Node(int rank){
        return arrayList.get(rank);
    }

    public void insert(ListNode node){
        if(size==0){
            arrayList.add(node);
            this.setHead(node);
            size++;
        }
        else{
            this.rank2Node(size-1).setNext(node);
            arrayList.add(node);
            size++;
        }
    }


}
