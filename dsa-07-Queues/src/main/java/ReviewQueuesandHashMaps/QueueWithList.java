package ReviewQueuesandHashMaps;

import java.util.ArrayList;
import java.util.List;

public class QueueWithList<E> {
    List<E> list;

    public QueueWithList() {
        this.list = new ArrayList<>();
    }

    public void enqueue(E e){
        // this will make an add operation into first place index 0
        list.add(0, e);
    }

    public E dequeue(){
        if (list.isEmpty()) return null;
        else return list.remove(list.size()-1);
    }

}
