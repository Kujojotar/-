package PQueue;

public class HeapTree {
    Entry[] heap;
    int size;

    public HeapTree(int pow){
        int a=1;
        int size=1;
        for(;a<=pow;a++){
            size*=2;
        }
        heap=new Entry[size];
        this.size=size;
    }

    public int getSize(){
        return this.size;
    }
    public void swap(int i,int target){
        Entry tmp=heap[i];
        heap[i]=heap[target];
        heap[target]=tmp;
    }

    public boolean isEmpty(){
        return heap[1]==null;
    }
    public int getLChild(int i){
        return i*2;
    }

    public int getRChild(int i){
        return i*2+1;
    }

    public int getParent(int i){
        return i/2;
    }

    public void swim(int i){
        int tmp=i;
        while(i!=1&&(Integer)heap[i].getKey()<(Integer)heap[this.getParent(i)].getKey()){
            swap(i,this.getParent(i));
            i=this.getParent(i);
        }
    }

    public void drop(){
        int tmp=1;
        while(2*tmp<size&&heap[this.getLChild(tmp)]!=null&&heap[this.getRChild(tmp)]!=null){
            heap[tmp]=(Integer)heap[this.getLChild(tmp)].getKey()<(Integer)heap[this.getRChild(tmp)].getKey()?
                    heap[this.getLChild(tmp)]:heap[this.getRChild(tmp)];
            tmp=(Integer)heap[this.getLChild(tmp)].getKey()<(Integer)heap[this.getRChild(tmp)].getKey()?this.getLChild(tmp):
                    this.getRChild(tmp);
        }
        if(2*tmp<size&&heap[this.getLChild(tmp)]==null&&heap[this.getRChild(tmp)]!=null){
            while(2*tmp<size&&heap[this.getRChild(tmp)]!=null){
                heap[tmp]=heap[this.getRChild(tmp)];
                tmp=this.getRChild(tmp);
            }
        }else if(2*tmp<size&&heap[this.getLChild(tmp)]!=null&&heap[this.getRChild(tmp)]==null){
            while(2*tmp<size&&heap[this.getLChild(tmp)]!=null){
                heap[tmp]=heap[this.getLChild(tmp)];
                tmp=this.getLChild(tmp);
            }
        }
        heap[tmp]=null;
        return;
    }

    public void enqueue(Entry a,int index){
        heap[index]=a;
        swim(index);

    }

    public Entry dequeue(){
        Entry tmp=heap[1];
        drop();
        return tmp;
    }

    public static void main(String[] args){
        Entry s1=new DefaultEntry(5,3);
        Entry s2=new DefaultEntry(7,3);
        Entry s3=new DefaultEntry(13,3);
        Entry s4=new DefaultEntry(-22,3);
        Entry s5=new DefaultEntry(4,3);
        Entry s6=new DefaultEntry(2,3);
        Entry s7=new DefaultEntry(-1,3);
        HeapTree pqueue=new HeapTree(3);
        pqueue.enqueue(s1,1);
        pqueue.enqueue(s2,2);
        pqueue.enqueue(s3,3);
        pqueue.enqueue(s4,4);
        pqueue.enqueue(s5,5);
        pqueue.enqueue(s6,6);
        pqueue.enqueue(s7,7);
        while(!pqueue.isEmpty()){
            System.out.println((Integer)pqueue.dequeue().getKey());
        }
    }



}
