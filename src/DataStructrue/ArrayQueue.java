package DataStructrue;

/**
 * Java队列的实现
 * @author:James
 * @version:0.1
 * @param:队列的默认大小，队列的大小，Object类型数组，队列头位置，队列尾位置
 */
public class ArrayQueue implements Queue {
    private static final int CAPACITY=1024;
    private int capacity;
    private Object[] queue;
    private int first=0;
    private int tail=0;

    //以默认容量构造队列
    public ArrayQueue(){
        this(CAPACITY);
    }

    //以指定容量构造队列
    public ArrayQueue(int capacity){
        queue=new Object[capacity];
        this.capacity=capacity;
    }

    //获取目前队列的大小，注意队列为空不一定真为空
    @Override
    public int getSize() {
        if(this.isEmpty()&&queue[tail+1]!=null){
            return capacity;
        }
        return (capacity-tail+first)%capacity;
    }

    //判断队列是否为空，但感觉效果不是那么好
    @Override
    public boolean isEmpty() {
        return first==tail;
    }

    //获取队列队尾元素但不出队
    @Override
    public Object front() throws RuntimeException{
        if(queue[tail]==null){
            throw new RuntimeException("tail reaches first!");
        }
        return queue[tail];
    }

    //入队
    @Override
    public void enqueue (Object obj) throws RuntimeException {
        if(this.isEmpty()&&queue[first]!=null){
            throw new RuntimeException("queue is full");
        }
         queue[first]=obj;
         first=(++first)%capacity;
    }

    //出队
    @Override
    public Object dequeue()
            throws RuntimeException{
        if(queue[tail]==null){
            throw new RuntimeException("tail reaches first!");
        }
         Object tmp=queue[tail];
         queue[tail]=null;
         tail=(++tail)%capacity;
         return tmp;
    }

}
