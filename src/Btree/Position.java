package Btree;

public interface Position {
    //返回当前节点中存放的对象
    public Object getElem();
    //将对象obj存入当前节点，并返回此前的内容
    public Object setElem(Object obj);
}
