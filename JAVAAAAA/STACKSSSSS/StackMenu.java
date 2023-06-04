import java.util.Scanner;

public class StackMenu {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack(5);
        int choice;
        boolean exit = false;

        System.out.println("Welcome to the Stack Application!");

        while (!exit) {
            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("*\tPlease choose an option:                \t*");
            System.out.println("*                                            *");
            System.out.println("*\t1. Create stack                        \t*");
            System.out.println("*\t2. Remove stack                        \t*");
            System.out.println("*\t3. List all the elements left          \t*");
            System.out.println("*\t4. Count the elements left on the stack\t*");
            System.out.println("*\t5. Exit                                \t*");
            System.out.println("*                                            *");
            System.out.println("**********************************************");
            
            choice = scanner.nextInt();
           
            switch (choice) {
                case 1:

                    System.out.println("Enter a value to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println("Value pushed successfully.");
                    break;
                case 2:
                    int popped = stack.pop();
                    System.out.println("Value popped: " + popped);
                    break;
                case 3:
                    System.out.print("Elements left on the stack: ");
                    stack.printStack();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Number of elements left on the stack: " + (stack.getTop()+ 1));
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the application!");
                    break;
                default:
                    System.out.println("Invalid. Try again :D");
            }
        }
        scanner.close();
    }
}