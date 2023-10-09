package ReviewQueuesandHashMaps.HashMapLeetCode;

public class HashMapTestApp {
public static void main(String[] args) {
    MyHashMap myHashMap = new MyHashMap();
    myHashMap.put(1, 1);
    myHashMap.put(2, 2);
    myHashMap.put (5, 5);
    myHashMap.put(100, 100);
    System.out.println(myHashMap.get(100));
    myHashMap.remove(100);
    System.out.println(myHashMap.get(100));
    myHashMap.put(1, 10);
    System.out.println(myHashMap.get(1));
    }
}