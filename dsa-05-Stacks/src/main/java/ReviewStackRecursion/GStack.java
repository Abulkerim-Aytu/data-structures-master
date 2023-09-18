package ReviewStackRecursion;

public class GStack<T> {
    GenericLinkedList<T> list=new GenericLinkedList<>();

    boolean isEmpty(){  return list.isEmpty();}
    void push(T t){  list.addFirst(t);}
    T pop() {  return list.removeFirst(); }
    int size(){return list.size;}
    T peek(){
        if (isEmpty()) return null;
        else return list.head.value;
    }
}
