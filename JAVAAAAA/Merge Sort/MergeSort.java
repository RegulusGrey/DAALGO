import java.util.*;

class MergeSort {

   public voic MergeSort(int[] array){
      if length = array.length;
      
      if(length <= 1)
         return;
         
      int middle = length/2;
      int[] leftArray = new in(middle);
      
      int[] rightArray = new int (length - middle);
      
      int i = 0;
      int j = 0;
      
      for(i = 0; i < length; i++)
      {
         if(i < middle)
         {
            leftArray[i] = array[i];
         }
         else
         {
            rightArray[j] = array[i];
            j++;
         }
      }
      
      MergeSort(leftArray);
      MergeSort(rightArray);
      Merge(leftArray, rightArray, array);
   }
   
   Merge(int[] leftArray, int[] rightArray, int[]array){
      
      int leftSize = array.length/2;
      int rightSize = array.length - leftSize;
      
      int i = 0, l = 0, r = 0;
      
      while(1 < leftSize
   }

}