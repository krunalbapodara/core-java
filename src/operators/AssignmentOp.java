package operators;

import java.util.Scanner;

public class AssignmentOp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =1;
        System.out.print("a = 1 and b = ");
        int b = s.nextInt();
        System.out.println("==============================");

        System.out.println("a += b = " + (a += b));
        System.out.println("a -= b = " + (a -= b));
        System.out.println("a x= b = " + (a *= b));
        System.out.println("a /= b = " + (a /= b));
        System.out.println("a %= b = " + (a %= b));
        System.out.println("a &= b = " + (a &= b));
        System.out.println("a ^= b = " + (a ^= b));
        System.out.println("a |= b = " + (a |= b));
        System.out.println("a <<= b = " + (a <<= b));
        System.out.println("a >>= b = " + (a >>= b));
        System.out.println("a >>>= b = " + (a >>>= b));

        s.close();
    }
}
