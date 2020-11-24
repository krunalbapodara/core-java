package operators;

import java.util.Scanner;

public class UnaryOp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter value of a - ");
        int a = s.nextInt();
        System.out.print("Enter value of b - ");
        int b = s.nextInt();
        System.out.println("a = "+ a + " b = "+b+" flag = true");
        System.out.println("==============================");
        
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);
        System.out.println("==============================");
        
        System.out.println("++a = " + (++a));
        System.out.println("a = " + a);
        System.out.println("==============================");
        
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);
        System.out.println("==============================");
        
        System.out.println("--a = " + (--a));
        System.out.println("a = " + a);
        System.out.println("==============================");
        
        System.out.println("~a = "+ ~a);
        System.out.println("a = " + a);
        System.out.println("==============================");
        
        System.out.println("~b = " + ~b);
        System.out.println("b = " + b);
        System.out.println("==============================");
        
        System.out.println("!flag = " + !flag);
        System.out.println("!!flag " + !!flag);
        System.out.println("==============================");

        s.close();
    }
}
