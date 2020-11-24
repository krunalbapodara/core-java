package operators;

import java.util.Scanner;

public class ShiftOp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = s.nextInt();
        System.out.println("==============================");

        System.out.println("a << 2 = " + (a << 2)); // multiply by 2 n times where n is digit after << operator.
        System.out.println("a >> 2 = " + (a >> 2)); // divide by 2 n times where n is digit after >> operator.
        System.out.println("a >>> 2 = " + (a >>> 2)); //For positive number, >> and >>> works same, for negative number, change parity bit (MSB) to 0
        System.out.println("-a >>> 2 = " + (-a >>> 2)); 

        s.close();
    }
}
