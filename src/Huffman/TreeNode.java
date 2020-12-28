package Huffman;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class TreeNode {
    private Object element;
    private int val;
    private TreeNode parent;
    private TreeNode LChild;
    private TreeNode RChild;

    public TreeNode(){
        this(null,0,null,null,null);
    }

    public TreeNode(Object element,int val,TreeNode parent,TreeNode LChild,TreeNode RChild){
        this.element=element;
        this.val=val;
        this.parent=parent;
        this.LChild=LChild;
        this.RChild=RChild;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Object getElement() {
        return element;
    }

    public TreeNode getParent() {
        return parent;
    }

    public TreeNode getLChild() {
        return LChild;
    }

    public TreeNode getRChild() {
        return RChild;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void setLChild(TreeNode LChild) {
        this.LChild = LChild;
    }

    public void setRChild(TreeNode RChild) {
        this.RChild = RChild;
    }
}
