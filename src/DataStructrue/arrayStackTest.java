package DataStructrue;

import DataStructrue.ArrayQueue;
import DataStructrue.ArrayStack;

import java.lang.RuntimeException;
public class arrayStackTest {
    public static void ArrayTransver(int[] array) throws RuntimeException{
        Stack stack=new ArrayStack(array.length);
        for(int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        for(int i=0;i<array.length;i++){
            array[i]=(Integer)stack.pop();
        }
        return;
    }

    public static void main(String[] args){
        int[] a=new int[5];
        a[0]=9;
        a[1]=7;
        a[2]=5;
        a[3]=3;
        a[4]=1;
        ArrayTransver(a);
        for(int e:a){
            System.out.println(e);
        }
        Queue queue=new ArrayQueue(5);
        try {
            for (int e : a) {
                queue.enqueue(e);
                System.out.println((int) queue.dequeue());
            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
}
