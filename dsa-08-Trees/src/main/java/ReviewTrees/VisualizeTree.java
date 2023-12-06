package ReviewTrees;

import java.util.Arrays;

public class VisualizeTree {

    public  static void printTree(TNode root, Trunk prev, boolean isLeft)
    {
        if (root == null) {
            return;
        }

        String prev_str = "    ";
        Trunk trunk = new Trunk(prev, prev_str);

        printTree(root.rightChild, trunk, true);

        if (prev == null) {
            trunk.str = "———";
        }
        else if (isLeft) {
            trunk.str = ".———";
            prev_str = "   |";
        }
        else {
            trunk.str = "`———";
            prev.str = prev_str;
        }

        showTrunks(trunk);
        System.out.println(" " + root.value);

        if (prev != null) {
            prev.str = prev_str;
        }
        trunk.str = "   |";

        printTree(root.leftChild, trunk, false);
    }
    public static void showTrunks(Trunk p)
    {
        if (p == null) {
            return;
        }

        showTrunks(p.prev);
        System.out.print(p.str);



        // Declaring an array of integers with a size of 5
        int[] myArray = new int[5];
        Arrays.stream(myArray).sorted();
    }
}
