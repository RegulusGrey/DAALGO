public class Stack{
   
   private int[] arr;
   private int top;
   private int capacity;
   
   public Stack(int capacity){
   
      this.arr = new int[capacity];
      this.capacity = capacity;
      this.top = -1;
       
   }
   
   public void push(int value){
      
      if(isFull()){
         System.out.println("Stack is full!");
         System.exit(1);
      }
      arr[++top] = value;
   }
   
   public int pop(){
      
      if(isEmpty()){
         System.out.println("Stack is empty!");
         System.exit(1);
      }
      return arr[top--];
   }
   
   public boolean isEmpty(){
      return top == -1;
   }
   
   public boolean isFull(){
      return top == capacity - 1;
   }
   
   public void printStack(){
      for(int i = 1; i <= top; i++){
         System.out.print(arr[i]+", ");
      }
   }
   
}