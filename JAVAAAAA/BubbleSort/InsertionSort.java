import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i);
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("Original Array: ");
        System.out.println(arr);
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        System.out.println(arr);
    }
}