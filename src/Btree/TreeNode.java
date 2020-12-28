package Btree;
import java.util.Queue;
import java.util.LinkedList;
import java.math.*;

public class TreeNode {
    Object element;
    TreeNode parent;
    TreeNode leftChild,rightChild;
    int size;

    public TreeNode(){
        this(null,null,null,null);
    }

    public TreeNode(TreeNode parent,TreeNode leftChild,TreeNode rightChild,Object element){
        this.parent=parent;
        this.leftChild=leftChild;
        this.rightChild=rightChild;
        this.element=element;
        size=1;
    }

    //判断是否有父亲（为使代码描述简洁）
    public boolean hasParent(){
        return parent!=null;
    }

    //返回当前节点的父节点
    public TreeNode getParent(){
        return this.parent;
    }

    //设置当前节点的父节点
    public void setParent(TreeNode p){
        this.parent=p;
    }

    //判断是否为叶子
    public boolean isLeaf(){
        return leftChild!=null&&rightChild!=null;
    }

    //判断是否为左孩子（为使代码描述简洁）
    public boolean isLChild(){
        if(this.parent==null){
            return false;
        }
        return this==this.parent.leftChild;
    }

    //判断是否有左孩子（为使代码描述简洁）
    public boolean hasLChild(){
        return leftChild!=null;
    }
    //返回当前节点的左孩子
    public TreeNode getLChild(){
        return this.leftChild;
    }
    //设置当前节点的左孩子（注意：this.lChild和c.parent都不一定为空）
    public void setLChild(TreeNode c){
        this.leftChild=c;
    }
    //判断是否为右孩子（为使代码描述简洁）
    public boolean isRChild(TreeNode rightChild){
        if(this.parent==null){
            return false;
        }
        return this==this.parent.rightChild;
    }
    //判断是否有右孩子（为使代码描述简洁）
    public boolean hasRChild(){
        return this.rightChild!=null;
    }
    //返回当前节点的右孩子
    public TreeNode getRChild(){
        return this.rightChild;
    }
    //设置当前节点的右孩子（注意：this.rChild和c.parent都不一定为空）
    public void setRChild(TreeNode c){
        this.rightChild=c;
    }
    //返回当前节点后代元素的数目
    public int getSize(){
        int size=1;
        if(this==null){
            return 0;
        }
        return size+this.leftChild.getSize()+this.rightChild.getSize();
    }
    //返回当前节点的高度
    public int getHeight(){
        if(this==null){
            return 0;
        }
        return Math.max(this.leftChild.getHeight(),this.rightChild.getHeight())+1;
    }
    //在孩子发生变化后，更新当前节点及其祖先的高度
    public int getDepth(){
        int i=1;
        TreeNode tmp=this;
        while(tmp.parent!=null){
            tmp=tmp.parent;
            i++;
        }
        return i;
    }
    //前序遍历
    public void elementsPreorder(){
        if(this!=null){
            Operation(this);
            this.leftChild.elementsPreorder();
            this.rightChild.elementsPreorder();
        }
    }
    //中序遍历
    public void elementsInorder(){
        if(this!=null){
            this.leftChild.elementsPreorder();
            Operation(this);
            this.rightChild.elementsPreorder();
        }
    }
    //后序遍历
    public void elementsPostorder(){
        if(this!=null){
            this.leftChild.elementsPreorder();
            this.rightChild.elementsPreorder();
            Operation(this);
        }
    }

    //层次遍历
    public void elementsLevelorder(){
        if(this==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(this);
        TreeNode tmp;
        while(!queue.isEmpty()){
            tmp=queue.remove();
            Operation(tmp);
            if(tmp.hasLChild()){
                queue.add(tmp.leftChild);
            }
            if(tmp.hasRChild()){
                queue.add(tmp.rightChild);
            }
        }
    }

    public void Operation(TreeNode T){
        //DoSomeThing...
    }
}
