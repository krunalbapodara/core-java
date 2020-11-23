package datatype;

public class PrimitiveDatatype {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");

        boolean b = true; // true or false
        System.out.println("boolean b= " + b);
        System.out.println("type of b " + ((Object) b).getClass().getName());

        System.out.println("--------------------------------------------");

        byte b1 = 127; // -128 to 127. default value 0.
        System.out.println("byte b1 = " + b1);
        System.out.println("type of b1 " + ((Object) b1).getClass().getName());

        System.out.println("--------------------------------------------");

        short s = 32767; // -32768 to 32767. default value 0.
        System.out.println("short s = " + s);
        System.out.println("type of s " + ((Object) s).getClass().getName());

        System.out.println("--------------------------------------------");

        int x = 2147483647; // -2147483647 to 2147483647. default value 0.
        System.out.println("int x = " + x);
        System.out.println("type of x " + ((Object) x).getClass().getName());

        System.out.println("--------------------------------------------");

        long l = 9223372036854775807L; // -9223372036854775808(-2^63) to -9223372036854775807(2^63 - 1). default value
                                       // 0.
        System.out.println("long l= " + l);
        System.out.println("type of l " + ((Object) l).getClass().getName());

        System.out.println("--------------------------------------------");

        float f = 127.3f; // unlimited value range. default value 0.0f
        System.out.println("float f = " + f);
        System.out.println("type of f " + ((Object) f).getClass().getName());

        System.out.println("--------------------------------------------");

        double d = 32767.3;// unlimited value range. default value 0.0d
        System.out.println("double d = " + d);
        System.out.println("type of d " + ((Object) d).getClass().getName());

        System.out.println("--------------------------------------------");

        char c = 'k'; // value range between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
        System.out.println("char c = " + c);
        System.out.println("type of c " + ((Object) c).getClass().getName());

        System.out.println("--------------------------------------------");

    }
}