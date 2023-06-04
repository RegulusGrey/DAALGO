import java.util.ArrayList;
import java.util.Scanner;

class InsertionInput {
    public static ArrayList<Integer> read() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        return arr;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = InsertionInput.read();
        System.out.println("Original Array: ");
        System.out.println(arr);
        InsertionSort.sort(arr);
        System.out.println("Sorted Array: ");
        System.out.println(arr);
    }
}