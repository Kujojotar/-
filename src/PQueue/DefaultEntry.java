package PQueue;

public class DefaultEntry implements Entry {
    Object key;
    Object value;

    public DefaultEntry(Object key,Object value){
        this.key=key;
        this.value=value;
    }

    @Override
    public Object setKey(Object key){
        Object tmp=this.key;
        this.key=key;
        return tmp;
    }

    @Override
    public Object getKey(){
        return this.key;
    }

    @Override
    public Object setValue(Object value){
        Object tmp=this.value;
        this.value=value;
        return tmp;
    }

    @Override
    public Object getValue(){
        return this.value;
    }
}
