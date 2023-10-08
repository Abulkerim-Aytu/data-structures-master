package ReviewQueuesandHashMaps;

public class QueueTest {
    public static void main(String[] args) {
        QueueWithList<Integer> myQueue=new QueueWithList<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
