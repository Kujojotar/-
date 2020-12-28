package PQueue;
import java.util.ArrayList;

public class PriorityQueue {

    private ArrayList<Object> array;
    int size;
    private Comparator comparator;

    public PriorityQueue(){
        array=new ArrayList<>();
        size=0;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public void enqueue(Object e){
        array.add(e);
        size++;
        if(size>1) {
            array.sort((x,y)->comparator.compare((Integer)x,(Integer)y));
        }
    }

    public void setComparator(Comparator t){
        this.comparator=t;
    }

    public Object dequeue(){
        size--;
        return array.remove(0);
    }

    public ArrayList<Object> getArray() {
        return array;
    }

    public static void main(String[] args){
        PriorityQueue queue=new PriorityQueue();
        queue.setComparator(new IntegerComparator());
        queue.enqueue(1);
        queue.enqueue(13);
        queue.enqueue(3);
        queue.enqueue(0);
        queue.enqueue(8);
        while(!queue.isEmpty()){
            System.out.println((Integer)queue.dequeue());
        }
    }
}
