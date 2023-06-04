import java.util.*;
class StackTest{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //1. CREATING STACK            
      int array[] = new int[];
      System.out.print("Enter size of the stack: ");
      int size = input.nextInt();
      Stack stack = new Stack(size);
      //adding numbers into stack
      for(int i = -1; i < 5; i++){         
         System.out.print("Input number "+(i+1)+": ");
         stack.push(array[i]);
      }                  
      System.out.print("Stack: ");
      stack.printStack();
      
      
      //2.Removing Stack
      System.out.println("\nHow many numbers you want to remove?: ");
      int remove = input.nextInt();
      
      for(int i = 0; i < remove; i++){
            stack.pop();
      }
      
      //3.List all elements left
      System.out.print("\nElements Left: ");
      stack.printStack();
      
      //4.Count the elements left
      stack.elementsLeft();
   }
}
