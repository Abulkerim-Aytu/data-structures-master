package ReviewQueuesandHashMaps.HashMapLeetCode;

import java.util.LinkedList;

public class BucketLinkedList {
    LinkedList<KeyValue<Integer,Integer>> bucketList;

    public BucketLinkedList() {
        this.bucketList = new LinkedList<KeyValue<Integer, Integer>>();
    }
    public int get(int key){
        // Basic search operation with key
        for(KeyValue<Integer,Integer> pair: bucketList){
            if (pair.key.equals(key)) return pair.value;
        }
        return -1;// couldn't find key
    }
    public void update(int key, int value){
        // if the element exists update it
        boolean found=false;
        for(KeyValue<Integer,Integer> pair: bucketList){
            if (pair.key.equals(key)) {
                found=true;
                pair.value=value;
            }
        }
        // else add it as a new element
        if(!found) this.bucketList.add(new KeyValue<>(key,value));
    }
    public void remove(int key){
        for(KeyValue<Integer,Integer> pair: bucketList){
            if (pair.key.equals(key)) bucketList.remove(pair);
        }
    }
}