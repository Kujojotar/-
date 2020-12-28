package DataStructrue;

import DataStructrue.ArrayQueue;

public class Josephus {
    //利用队列结构模拟Josophus环
    public static Object Josephus(Queue Q, int k) {
        if (Q.isEmpty()&&Q.front()==null) return null;
        while (Q.getSize() > 1) {//不断迭代
            for (int i=0; i < k; i++)//将山芋向前传递k次
                Q.enqueue(Q.dequeue());
            Object e = Q.dequeue();//拿着山芋的孩子退出
            System.out.println("\n\t" + e + "退出");
        }
        return Q.dequeue();//最后剩下的那个孩子
    }
    //将一组对象组织为一个队列
    public static Queue buildQueue(Object a[]) {
        Queue Q = new ArrayQueue(15);
        for (int i=0; i<a.length; i++)
            Q.enqueue(a[i]);
        return Q;
    }

    //测试用main方法
    public static void main(String[] args) {
        String[] kid = {"Alice", "Bob", "Cindy", "Doug", "Ed",
                "Fred", "Gene", "Hope", "Irene", "Jack",
                "Kim", "Lance", "Mike", "Nancy", "Ollie"};
        System.out.println("最终的幸运者是" + Josephus(buildQueue(kid), 8));
    }
}
