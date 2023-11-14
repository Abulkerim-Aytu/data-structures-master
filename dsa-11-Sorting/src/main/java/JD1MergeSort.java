public class JD1MergeSort {
   public static void mergeSort(int[] array){
       if (array.length<2) return;// if you have an array with one element STOP
       int mid=array.length/2;
       int[] leftArray=new int[mid];
       for (int i = 0; i <mid ; i++) leftArray[i]=array[i];
       int[] rightArray=new int[array.length-mid];
       for (int i = mid; i < array.length ; i++) rightArray[i-mid]=array[i];
       mergeSort(leftArray);
       mergeSort(rightArray);
       merge(leftArray, rightArray, array);
   }
    public static void merge(int[] left, int[] right, int[] result){
        int l=0,r=0,k=0;
        // The First case ; I have elements on both left and right.
        // When we out of this loop that mean we came to the end of the one or two arrays, then maybe we have some leftovers.
       while(l<left.length && r<right.length){
           if (left[l]<=right[r]) result[k++]=left[l++];
           else result[k++]=right[r++];
       }
       // The Second case ; I have element on only one side.
       while(l<left.length) result[k++]=left[l++];
       while(r<right.length) result[k++]=right[r++];
    }
}
