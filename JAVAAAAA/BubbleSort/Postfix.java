import java.util.Stack;

public class Postfix{
    public static String postfixToInfix(String expression) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/^";
        for (char c : expression.toCharArray()) {
            if (!operators.contains(String.valueOf(c))) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op2 + c + op1 + ")");
            }
        }
        return stack.pop();
    }

    public static String postfixToPrefix(String expression) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/^";
        for (char c : expression.toCharArray()) {
            if (!operators.contains(String.valueOf(c))) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(c + op2 + op1);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "ab+c*";
        String infixExpression = postfixToInfix(postfixExpression);
        String prefixExpression = postfixToPrefix(postfixExpression);
        System.out.println("Postfix: " + postfixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Prefix: " + prefixExpression);
    }
}