public class Main {
   public static void main(String[] args) {
      BubbleSort b = new BubbleSort();
      BubbleSort.ArrayInput int[] arr = b.new ArrayInput();
      System.out.println("Array before sorting: ");
      System.out.println(Arrays.toString(arr));
      BubbleSort.sort(arr);
      System.out.println("Array after sorting: ");
      System.out.println(Arrays.toString(arr));
   }
}