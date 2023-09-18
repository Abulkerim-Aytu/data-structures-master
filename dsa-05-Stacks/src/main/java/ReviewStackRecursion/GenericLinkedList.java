package ReviewStackRecursion;

public class GenericLinkedList<T> {
    GNode<T> head;
    GNode<T> tail;
    int size;
    boolean isEmpty(){return head==null;}

    void addFirst(T t){
        //create a new node from the input
        GNode<T> node=new GNode(t);
        //case1 : list is empty
        if(isEmpty()){
            head=tail=node;
        }else {  // case 2: list is not empty
            node.next=head;
            head=node;
        }
       size++;// increase the size after addFirst
    }
    T removeFirst(){
        if (isEmpty()) return null;
        T result=null;
        // case 1 : one element list
        if (head==tail) {
            result=head.value;
            head=tail=null;
        }else { // case 2 : more than one element
            result=head.value;
            head=head.next;
        }
        size--;
        return result;
    }
    void printNodes(){
        GNode<T> current=head;
        while(current!=null){
            if(current.next==null) System.out.print(current.value + " => null");
            else System.out.print(current.value + " => ");
            current=current.next;
        }
    }
}
