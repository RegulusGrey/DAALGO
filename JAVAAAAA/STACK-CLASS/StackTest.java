class StackTest{

   public static void main(String[] args){
      
      Stack stack = new Stack(5);
      
      stack.push(1);
      stack.push(4);
      stack.push(7);
      
      System.out.print("Stack: ");
      stack.printStack();
      
      stack.pop();
      System.out.println("\n\nAfter popping: ");
      stack.printStack();
   }


}