package operators;

import java.util.Scanner;

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a - ");
        int a = s.nextInt();
        System.out.print("Enter value of b - ");
        int b = s.nextInt();
        System.out.println("a = "+ a +" and b = "+b);
        System.out.println("a + b = " + (a + b));// 15
        System.out.println("a - b = " + (a - b));// 5
        System.out.println("a x b = " + (a * b));// 50
        System.out.println("a / b = " + (a / b));// 2
        System.out.println("a % b = " + (a % b));// 0
        s.close();
    }
}
