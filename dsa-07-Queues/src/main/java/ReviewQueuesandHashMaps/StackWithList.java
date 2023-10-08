package ReviewQueuesandHashMaps;


import java.util.ArrayList;
import java.util.List;

public class StackWithList<E> {
    List<E> list;

    public StackWithList() {
        this.list=new ArrayList<>();
    }
    public void push(E e){
        // insert into first
        list.add(0, e);
    }
    public E pop(){
        // remove first
        if (list.isEmpty()) return null;
        else return list.remove(0);
    }
}
