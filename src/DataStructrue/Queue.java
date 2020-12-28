package DataStructrue;

public interface Queue {
    public int getSize();//返回队列中元素数目
    public boolean isEmpty();//判断队列是否为空
    public Object front()//取队首元素（但不删除）
            throws RuntimeException;
    public void enqueue (Object obj)
            throws RuntimeException;//入队
    public Object dequeue()//出队
            throws RuntimeException;
}
