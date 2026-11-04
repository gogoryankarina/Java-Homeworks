public class Variables {

    /**
     * Demonstrates primitive data types and type casting in Java.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // 1. Byte
        byte a = 1;
        byte b = 2;
        System.out.println("Byte: " + a + ", " + b);

        // 2. Short
        short c = 3;
        short d = 4;
        System.out.println("Short: " + c + ", " + d);

        // 3. Int
        int e = 5;
        int f = 6;
        System.out.println("Int: " + e + ", " + f);

        // 4. Long
        long g = 7L;
        long h = 8L;
        System.out.println("Long: " + g + ", " + h);

        // 5. Min and Max values
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);

        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);

        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Min: " + Integer.MIN_VALUE);

        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);

        // 6. Binary numbers
        byte x = 0b00000001;
        int y = 0b00000000000000000000000000000010;

        System.out.println("Binary byte: " + x);
        System.out.println("Binary int: " + y);

        // Floating point numbers

        // 6. Float
        float j = 1.1f;
        float k = 2.2f;
        System.out.println("Float: " + j + ", " + k);

        // 7. Double
        double l = 3.3;
        double m = 4.4;
        System.out.println("Double: " + l + ", " + m);

        // 8. Float and Double Min and Max
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);

        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);

        // 9. Float and Double values
        float first = 12.345f;
        float second = 8923.1234857f;
        float third = 3456.091f;

        double fourth = 34.567839023;

        System.out.println("Float values: " + first + ", " + second + ", " + third);
        System.out.println("Double value: " + fourth);

        // Character

        // 10. Char
        char n = 'a';
        char o = 'b';
        System.out.println("Characters: " + n + ", " + o);

        // 11.1 Unicode values
        char s = 77;
        char w = 109;

        System.out.println("s = " + s);
        System.out.println("w = " + w);

        // 11.2 All possible forms of K
        System.out.println('K');
        System.out.println('\u004B');
        System.out.println((char) 75);

        char t = 75;
        System.out.println(t);

        // Boolean

        // 12. Boolean
        boolean p = true;
        boolean q = false;
        System.out.println("Boolean: " + p + ", " + q);

        // 13. Error explanation
        // int year = 201l;
        // This code gives a compilation error because
        // 201l is a long literal, not an int literal.

        // Type Casting

        // 14. Widening: int to long
        int aa = 7;
        long bb = aa;

        System.out.println("Int to Long: " + bb);

        // 15. Widening: int to double
        int myInt = 7;
        double myDouble = myInt;

        System.out.println("Int to Double: " + myDouble);

        // 16. Narrowing: double to int
        double dd = 9.78d;
        int ii = (int) dd;

        System.out.println("Double to Int: " + ii);

        // 17. Narrowing: int to byte
        int ff = 9999;
        byte gg = (byte) ff;

        System.out.println("Int to Byte: " + gg);

        // 18. Corrected errors

        long max = 3123456789L;

        double number = 1000.00;

        char i = 'i';
        char jj = 'j';
        char ij = (char) (i + jj);

        int a7 = 8;

        long hh = 0;
        hh = hh + 8;

        int nn = 5;
        int mm = 11;
        mm = nn;

        System.out.println("Corrected long: " + max);
        System.out.println("Corrected double: " + number);
        System.out.println("Corrected char: " + ij);
        System.out.println("Corrected int: " + a7);
        System.out.println("Corrected h: " + hh);
        System.out.println("Corrected m: " + mm);
    }
}
