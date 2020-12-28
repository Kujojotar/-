package Huffman;
import PQueue.Comparator;
import PQueue.IntegerComparator;

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
}
