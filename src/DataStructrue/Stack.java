package DataStructrue;

public interface Stack {
    //返回栈的大小

    public int getSize();

    //判断栈是否为空
    public boolean isEmpty();

    //判断栈是否已满
    public boolean isFull();

    //获取栈顶元素
    public Object top() throws RuntimeException ;

    //入栈操作
    public void push (Object ele) throws RuntimeException ;

    //出栈操作
    public Object pop() throws RuntimeException ;
}
