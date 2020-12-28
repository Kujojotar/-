package DataStructrue;

public class TreeLinkedList implements Tree {
    private Object element;
    private TreeLinkedList father,child,brother;

    public TreeLinkedList(){
        this(null,null,null,null);
    }

    public TreeLinkedList(Object element,TreeLinkedList father,TreeLinkedList child,TreeLinkedList brother){
        this.element=element;
        this.father=father;
        this.child=child;
        this.brother=brother;
    }


    //返回当前节点中存放的对象
    @Override
    public Object getElem(){
        return element;
    }

    //将对象obj存入当前节点，并返回此前的内容
    @Override
    public Object setElem(Object obj){
        Object tmp=obj;
        this.element=obj;
        return tmp;
    }

    //返回当前节点的父节点
    @Override
    public TreeLinkedList getParent(){
        return father;
    }

    //返回当前节点的长子
    @Override
    public TreeLinkedList getFirstChild(){
        return child;
    }

    //返回当前节点的最大弟弟
    @Override
    public TreeLinkedList getNextSibling(){
        return brother;
    }

    //返回当前节点后代元素的数目，即以当前节点为根的子树的规模
    @Override
    public int getSize(){
        int size=1;
        TreeLinkedList tmp=this;
        while(tmp.child!=null){
            tmp=tmp.child;
            size+=tmp.getSize();
        }
        return size;
    }

    //返回当前节点的高度
    @Override
    public int getHeight(){
        int depth=0;
        TreeLinkedList tmp=this;
        while(tmp.child!=null){
            tmp=tmp.child;
            depth++;
        }
        return depth;
    }

    //返回当前节点的深度
    @Override
    public int getDepth(){
        int height=0;
        TreeLinkedList tmp=this;
        while(tmp.father!=null){
            tmp=tmp.father;
            height++;
        }
        return height;
    }
}
