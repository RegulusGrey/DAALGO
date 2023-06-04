import java.util.Scanner;

public class StackMenu {
    private static Stack stack = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Create stack");
            System.out.println("2. Remove stack");
            System.out.println("3. List all elements left");
            System.out.println("4. Count the elements left on the stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the capacity of the stack: ");
                    int capacity = scanner.nextInt();
                    stack = new Stack(capacity);
                    break;
                case 2:
                    stack = null;
                    break;
                case 3:
                    if (stack == null) {
                        System.out.println("Stack is not created yet");
                    } else {
                        System.out.print("Stack: ");
                        stack.printStack();
                        System.out.println();
                    }
                    break;
                case 4:
                    if (stack == null) {
                        System.out.println("Stack is not created yet");
                    } else {
                        System.out.println("Number of elements left: " + (stack.top + 1));
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}