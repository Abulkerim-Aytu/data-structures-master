package ReviewSorting;

public class DNode {
    int key;
    int value;
    DNode next;
    DNode prev;

    public DNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public DNode() {
    }
}
