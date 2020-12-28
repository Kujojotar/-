package Huffman;

import DataStructrue.Tree;
import java.util.Map;
import java.util.ArrayList;

import java.util.ArrayList;

public class HuffmanTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public HuffmanTree(TreeNode root){
        this.root=root;
    }

    public static TreeNode buildTreeNode(TreeNode a,TreeNode b){
        TreeNode root=new TreeNode(null,a.getVal()+b.getVal(),null,null,null);
        root.setLChild(a);
        root.setRChild(b);
        a.setParent(root);
        b.setParent(root);
        return root;
    }

    public static TreeNode buildHuffmanTree(ArrayList<TreeNode> array){
        TreeNode tmp=new TreeNode();
        TreeNode tmp1;
        TreeNode tmp2;
        while(!array.isEmpty()){
            tmp=HuffmanTree.buildTreeNode(array.remove(0),array.remove(0));
            if(array.isEmpty()){
                break;
            }
            array.add(tmp);
            array.sort((x,y)->x.getVal()>=y.getVal()?1:-1);
        }
        return tmp;
    }

    public void Transver(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println((String)root.getElement()+"    "+root.getVal());
        Transver(root.getLChild());
        Transver(root.getRChild());
    }

    public static void main(String[] args){
        String a="hhhhhhedkkds";
        Map<Character,Integer> map=StringFactory.getMap(a);
        ArrayList<TreeNode> array=StringFactory.transfer(map);
        array.forEach(x->System.out.println(x.getVal()));
        HuffmanTree tree=new HuffmanTree(HuffmanTree.buildHuffmanTree(array));
        tree.Transver(tree.root);
    }
}
