import java.util.Scanner;

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Object> linkedList = new LinkedListImpl<>();
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    Object data = scanner.next();
                    linkedList.insert(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    data = scanner.next();
                    linkedList.delete(data);
                    break;
                case 3:
                    System.out.print("Linked List: ");
                    linkedList.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}