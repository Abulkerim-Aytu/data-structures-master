package HeapReview;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        // Min Heap implementation with integers- Default is a min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(1);
        pq.add(3);
        pq.add(43);
        pq.add(2);
        System.out.println("Min Heap Outputs");
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        // Max Heap Implementation using Comparator
        PriorityQueue<Integer> pq2=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        pq2.add(12);
        pq2.add(1);
        pq2.add(3);
        pq2.add(43);
        pq2.add(2);
        System.out.println("Max Heap Outputs");
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());

        // Min Heap with Strings Implementation
        PriorityQueue<String> pq3=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        pq3.add("Jack");
        pq3.add("Adam");
        pq3.add("Eve");
        pq3.add("Becky");
        pq3.add("Carol");

        System.out.println();
        System.out.println("Min Heap for Strings");
        System.out.println(pq3.remove());
        System.out.println(pq3.remove());
        // Max Heap with Strings Implementation
        PriorityQueue<String> pq4=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        pq4.add("Jack");
        pq4.add("Adam");
        pq4.add("Eve");
        pq4.add("Becky");
        pq4.add("Carol");

        System.out.println();
        System.out.println("Max Heap for Strings");
        System.out.println(pq4.remove());
        System.out.println(pq4.remove());
    }

}
