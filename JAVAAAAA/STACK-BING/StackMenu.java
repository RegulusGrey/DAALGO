import java.util.Scanner;

public class StackMenu {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a stack object with capacity 5
        Stack stack = new Stack(5);
        
        // Declare a variable for user choice
        int choice;
        
        // Declare a variable for loop condition
        boolean exit = false;
        
        // Print a welcome message
        System.out.println("Welcome to Stack Menu Application!");
        
        // Start a while loop
        while (!exit) {
            // Print the menu options
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
            
            // Get the user choice
            choice = scanner.nextInt();
            
            // Use a switch-case statement to execute different actions
            switch (choice) {
                case 1:
                    // Ask the user for a value to push
                    System.out.println("Enter a value to push:");
                    int value = scanner.nextInt();
                    
                    // Call the push method of stack object
                    stack.push(value);
                    
                    // Print a confirmation message
                    System.out.println("Value pushed successfully.");
                    break;
                case 2:
                    // Call the pop method of stack object and store the returned value
                    int popped = stack.pop();
                    
                    // Print a confirmation message with the popped value
                    System.out.println("Value popped: " + popped);
                    break;
                case 3:
                    // Print a message with all the elements left on the stack
                    System.out.print("Elements left on the stack: ");
                    
                    // Call the printStack method of stack object
                    stack.printStack();
                    
                    // Print a new line
                    System.out.println();
                    break;
                case 4:
                    // Print a message with the number of elements left on the stack
                    System.out.println("Number of elements left on the stack: " + (stack.getTop()+ 1));
                    break;
                case 5:
                    // Set exit to true to end the loop
                    exit = true;
                    
                    // Print a goodbye message
                    System.out.println("Thank you for using Stack Menu Application!");
                    break;
                default:
                    // Print an invalid option message
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        // Close the scanner object
        scanner.close();
    }
}