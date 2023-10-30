package HeapReview;

public class HeapifyTespApp {
    public static void main(String[] args) {
        int[] numbers={1,2,5,6,8,21,0};
        HeapClassWithHeapify mh=new HeapClassWithHeapify(numbers);
        mh.printHeap();
        //System.out.println(mh.remove());
    }
}
