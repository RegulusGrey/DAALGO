import java.util.*;

class ArrayInput extends BubbleSort{
   public static int[] read() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the array elements: ");
      for(int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      return arr;
   }
   
   public static void main(String[] args) {
      int[] arr = ArrayInput.read();
      System.out.println("Array before sorting: ");
      System.out.println(Arrays.toString(arr));
      BubbleSort.sort(arr);
      System.out.println("Array after sorting: ");
      System.out.println(Arrays.toString(arr));
   }
}