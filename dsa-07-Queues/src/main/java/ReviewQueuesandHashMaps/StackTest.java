package ReviewQueuesandHashMaps;

public class StackTest {
    public static void main(String[] args) {

        StackWithList myStack=new StackWithList<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop()); // Last in First out Structure
    }
}
