package datatype;

public class NonPrimitiveDatatypes {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");

        String s = "Krunal";
        System.out.println("String s = "+s);
        System.out.println("type of s is "+s.getClass().getName());

        System.out.println("--------------------------------------------");

        char c[] = {'k','r','u','n','a','l'};
        System.out.println("char c[0] = "+c[0]);
        System.out.println("type of c is "+c.getClass().getName());

    }
}
