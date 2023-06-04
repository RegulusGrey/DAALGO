import java.util.*;

public class PostMain extends Postfix {

   public static void main(String[] args) {
   
      Postfix 
      
      String postfixExpression = "ab+c*";
      String infixExpression = postfixToInfix(postfixExpression);
      String prefixExpression = postfixToPrefix(postfixExpression);
      System.out.println("Postfix: " + postfixExpression);
      System.out.println("Infix: " + infixExpression);
      System.out.println("Prefix: " + prefixExpression);
    }

}
