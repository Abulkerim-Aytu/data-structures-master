package ReviewStackRecursion;

public class GenericLLTestApp {
    public static void main(String[] args) {
        GenericLinkedList<Integer> myList=new GenericLinkedList<>();
        myList.addFirst(12);
        myList.addFirst(11);
        myList.addFirst(15);
        myList.printNodes();
        System.out.println();
        System.out.println(myList.removeFirst());

        myList.printNodes();

    }
}
