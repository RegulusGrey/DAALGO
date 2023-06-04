class Main {

   public static void main (String[]args){
      //Write a function to reverse a string.
      String original = "Reverse";
      System.out.println("reversed: " + reverseString(original));
      
      
      //Write a program to find the maximum and minimum values in an array.
      
      
      //Implement a stack data structure with push, pop, and peek operations.
      
      
      //Write a program to sort an array of integers in ascending order.
      
      
      //Implement a binary search algorithm.
      
      //Write a program to solve the Fibonacci sequence.
      
      //Write a function to check whether a string is a palindrome.
      
      //Implement a linked list data structure with add, remove, and search operations.

   }
   
   //Write a function to reverse a string.
   public static String reverseString(String str) {
      StringBuilder sb = new StringBuilder(str);
      return sb.reverse().toString();
   }
   
   //Write a program to find the maximum and minimum values in an array.
   public static void findMaxMin(int[] arr) {
       int max = arr[0];
       int min = arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           } else if (arr[i] < min) {
               min = arr[i];
           }
       }
       System.out.println("Maximum value: " + max);
       System.out.println("Minimum value: " + min);
   }
   
   //Implement a stack data structure with push, pop, and peek operations.
   public class Stack {
       private int[] arr;
       private int top;
       
       public Stack(int capacity) {
           arr = new int[capacity];
           top = -1;
       }
       
       public void push(int value) {
           if (top == arr.length - 1) {
               throw new StackOverflowError();
           }
           arr[++top] = value;
       }
       
       public int pop() {
           if (top == -1) {
               throw new EmptyStackException();
           }
           return arr[top--];
       }
       
       public int peek() {
           if (top == -1) {
               throw new EmptyStackException();
           }
           return arr[top];
       }
   }

   //Write a program to sort an array of integers in ascending order.
   
   public static void bubbleSort(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++) {
           for (int j = 0; j < arr.length - i - 1; j++) {
               if (arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
   }
   
   
   //Implement a binary search algorithm.
   public static int binarySearch(int[] arr, int target) {
       int left = 0;
       int right = arr.length - 1;
       while (left <= right) {
           int mid = (left + right) / 2;
           if (arr[mid] == target) {
               return mid;
           } else if (arr[mid] < target) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       return -1;
   }
   
   
   //Write a program to solve the Fibonacci sequence.
   
   public static int fibonacci(int n) {
       if (n <= 1) {
           return n;
       }
       int fib1 = 0;
       int fib2 = 1;
       int fib = 0;
       for (int i = 2; i <= n; i++) {
           fib = fib1 + fib2;
           fib1 = fib2;
           fib2 = fib;
       }
       return fib;
   }
   
   
   //Write a function to check whether a string is a palindrome.
   public static boolean isPalindrome(String str) {
       int i = 0;
       int j = str.length() - 1;
       while (i < j) {
           if (str.charAt(i) != str.charAt(j)) {
               return false;
           }
           i++;
           j--;
       }
       return true;
   }
   
   
   ///////////Implement a linked list data structure with add, remove, and search operations. [different class]

   //Write a program to calculate the factorial of a number.
   public static int factorial(int n) {
       if (n == 0) {
           return 1;
       }
       return n * factorial(n - 1);
   }
   
   /////////Implement a hash table data structure with add, remove, and search operations. [different class]
   



}


