package DataStructrue;

/**
 * Java数组栈的实现
 * @author:James
 * @version:0.1
 * @param:栈的默认容量，栈的目前容量，Object类型数组，栈顶位置
 */
public class ArrayStack implements Stack {
    private static final int CAPACITY=1024;
    private int capacity;
    private Object[] array;
    private int top=-1;

    //无参构造器
    public ArrayStack(){
        this(CAPACITY);
    }

    //带参构造器
    public ArrayStack(int capacity){
        this.capacity=capacity;
        array=new Object[capacity];
    }

    //返回栈的大小
    @Override
    public int getSize(){
        return capacity;
    }

    //判断栈是否为空
    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    //判断栈是否已满
    @Override
    public boolean isFull(){
        return top==capacity-1;
    }

    //获取栈顶元素
    @Override
    public Object top() throws RuntimeException {
        if(top>=capacity){
            throw new RuntimeException("Stack size overwhelm capacity");
        }
        return array[top];
    }

    //入栈操作
    @Override
    public void push (Object ele) throws RuntimeException {
        if(top>=capacity){
            throw new RuntimeException("Stack size overwhelm capacity");
        }
        array[++top]=ele;
    }

    //出栈操作
    @Override
    public Object pop() throws RuntimeException {
        Object n;
        if(this.isEmpty()){
            throw new RuntimeException("EmptyStack");
        }
        if(top>=capacity){
            throw new RuntimeException("Stack size overwhelm capacity");
        }
        n=array[top--];
        array[top+1]=null;
        return n;
    }
}

/*
你可能注意到，在弹出栈顶之后，将原栈顶 S[top]置为 null 的操作似乎是多余的⎯⎯即使省略
这一步，该方法依然符合 ADT 定义的要求。不过就 Java 语言而论，在实现该方法时若果真准备省
略这一步，我们就必须对利弊做一权衡。这涉及到 Java 的内存垃圾回收机制（Garbage collection
mechanism）⎯⎯Java 会自动监测存放各对象的内存区域，一旦发现某个对象不再被任何活跃的对
象引用，就会回收其占用的空间。假设原栈顶为 e = S[top]，在应用 pop()方法时将 S[top]置为 null，
实际上就是告诉系统：该栈元素不再保留指向对象 e 的一个引用。于是，只要不再有任何活跃的引
用指向 e，该对象占用的内存空间就会被当作垃圾被回收。
 */