package Review3_LinkedList;

public class UserLinkedList {
    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
    }
    public boolean isEmpty(){return head==null;}
    public void insertLast(UserNode node){
        //case 1 : list is empty
        if(isEmpty()) {
            head=tail=node;
        }
        // case 2: list is NOT empty
        else {
            tail.next=node;// add node after tail
            tail=node;
        }
        size++;
    }

    public void printNames(){
        UserNode current=head;// starting address is assigned to current
        while(current!=null) {
            System.out.println(current.name);
            current=current.next;
        }

    }
    public void deleteByName(String name){
        // check if list is empty if empty return
        UserNode prev=head;
        UserNode current=head;
        while (current!=null){
            if (current.name.equals(name)){
                //case 1; head
                if(current==head){
                    // head and tail equal only one element in list
                    if (head==tail){tail=null;}
                    head=current.next;
                    current.next=null;
                }
                // case 2: tail
                else if(current==tail){
                    prev.next=null;
                    tail=prev;
                }
                // case 3 middle
                else {
                    prev.next=current.next;
                    current.next=null;// helps Garbage Collection but not required
                }
                size--;// size--;
            }
            prev=current;
            current=current.next;

        }
    }

}
