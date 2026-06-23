
package day5.discussion;

public class ArithmeticOperator {
    // + - * / %
    public static void main(String[] args) {
        int num = 55;
        int num2 = 10;
        int sum = num + num2;
        int difference = num - num2;
        int product = num * num2;
        int quotient = num / num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println(num % num2);
    }
}
