public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            boolean swap=false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]) {
                    swap (array, j,j+1);
                    swap=true;
                }
            }
            if(!swap) return array; // Help of this boolean performance of this algo is O(n).
        }
        return array;
    }
    public static void swap(int[] array, int idx1, int idx2){
        int temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]=temp;
    }
}
