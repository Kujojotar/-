package Huffman;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;

public class StringFactory {
    public static ArrayList<TreeNode> transfer(Map<Character,Integer> map){
        Iterator<Map.Entry<Character,Integer>> iterator=map.entrySet().iterator();
        ArrayList<TreeNode> array=new ArrayList<>();
        iterator.forEachRemaining(x->array.add(new TreeNode(String.valueOf(x.getKey()),x.getValue(),null,null,null)));
        array.sort((x,y)->x.getVal()>=y.getVal()?1:-1);
        return array;
    }

    public static Map<Character,Integer> getMap(String a){
        Map<Character,Integer> map=new HashMap<>();
        int b=0;
        while(b<a.length()){
            if(!map.containsKey(a.charAt(b))){
                map.put(a.charAt(b),1);
            }
            else{
                map.put(a.charAt(b),map.get(a.charAt(b))+1);
            }
            b++;
        }
        return map;
    }

}
