package DataStructrue;

public class TwoSidesNode {
    TwoSidesNode prev;
    TwoSidesNode next;
    Object element;

    public TwoSidesNode(){
        this(null,null,null);
    }

    public TwoSidesNode(TwoSidesNode prev,TwoSidesNode next,Object element){
        this.prev=prev;
        this.next=next;
        this.element=element;
    }

    public TwoSidesNode getPrev() {
        return prev;
    }

    public TwoSidesNode getNext() {
        return next;
    }


    public void setPrev(TwoSidesNode prev) {
        this.prev = prev;
    }

    public Object getElement(){
        return this.element;
    }

    public Object setElement(Object element){
        Object tmp;
        tmp=this.element;
        this.element=element;
        return tmp;
    }

}
