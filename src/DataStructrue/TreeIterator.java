package DataStructrue;

import DataStructrue.ArrayQueue;
import DataStructrue.TreeLinkedList;

public class TreeIterator {

    public void TransverPreOrder(TreeLinkedList tmp){
        if(tmp!=null){
            System.out.println(tmp.getElem());
            for(tmp=tmp.getFirstChild();tmp!=null;tmp=tmp.getNextSibling()){
                TransverPreOrder(tmp);
            }
        }
    }

    public void TransverLatterOrder(TreeLinkedList tmp){
        if(tmp!=null){
            for(tmp=tmp.getFirstChild();tmp!=null;tmp=tmp.getNextSibling()){
                TransverPreOrder(tmp);
                System.out.println(tmp.getElem());
            }
        }
    }

    public void levelTraversalIterator(TreeLinkedList tmp) {
        ArrayQueue queue=new ArrayQueue();
        if(tmp!=null){
            queue.enqueue(tmp);
            while(!queue.isEmpty()){
                System.out.println(((TreeLinkedList)queue.dequeue()).getElem());
                for(tmp=tmp.getFirstChild();tmp!=null;tmp=tmp.getNextSibling()){
                    queue.enqueue(tmp);
                }
            }
        }
    }
}
