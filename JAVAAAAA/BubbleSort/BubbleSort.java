// import java.util.*;
// 
// public class BubbleSort {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter the size of the array: ");
//       int n = sc.nextInt();
//       int[] arr = new int[n];
//       System.out.println("Enter the array elements: ");
//       for(int i = 0; i < n; i++) {
//          arr[i] = sc.nextInt();
//       }
//       System.out.println("Array before sorting: ");
//       System.out.println(Arrays.toString(arr));
//       bubbleSort(arr);
//       System.out.println("Array after sorting: ");
//       System.out.println(Arrays.toString(arr));
//    }
//    
//    public static void bubbleSort(int[] arr) {
//       int n = arr.length;
//       boolean swapped;
//       for(int i = 0; i < n - 1; i++) {
//          swapped = false;
//          for(int j = 0; j < n - i - 1; j++) {
//             if(arr[j] > arr[j+1]) {
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//                swapped = true;
//             }
//          }
//          if(swapped == false) {
//             break;
//          }
//       }
//    }
// }


import java.util.*;

public class BubbleSort {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the array elements: ");
      for(int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("Array before sorting: ");
      System.out.println(Arrays.toString(arr));
      bubbleSort(arr);
      System.out.println("Array after sorting: ");
      System.out.println(Arrays.toString(arr));
   }
   
   public static void bubbleSort(int[] arr) {
      int n = arr.length;
      boolean swapped;
      for(int i = 0; i < n - 1; i++) {
         swapped = false;
         for(int j = 0; j < n - i - 1; j++) {
            if(arr[j] < arr[j+1]) { // modified comparison
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
               swapped = true;
            }
         }
         if(swapped == false) {
            break;
         }
      }
   }
}


