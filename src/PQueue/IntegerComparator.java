package PQueue;

public class IntegerComparator implements Comparator {
    @Override
    public int compare(Object first,Object second){
        return (Integer)first-(Integer)second;
    }
}
