package Review3_LinkedList;

public class UserLinkedListTEstApp {
    public static void main(String[] args) {
        UserLinkedList myList=new UserLinkedList();
        myList.insertLast(new UserNode("john","smith"));
        myList.insertLast(new UserNode("john2","smith2"));
        myList.insertLast(new UserNode("john3","smith3"));
        myList.printNames();

        myList.deleteByName("john3");
        System.out.println("After deleting john3");
        myList.printNames();
    }
}
