import java.util.Arrays;
import java.util.Scanner;

class MergeSortDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Sorter sorter = new MergeSort();
        sorter.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}