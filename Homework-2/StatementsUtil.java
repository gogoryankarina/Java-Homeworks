import java.util.Scanner;

public class StatementsUtil {

    /**
     * Checks whether a number is even.
     *
     * @param x the integer to check
     * @return true if x is even
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * Checks whether a number is positive or negative.
     *
     * @param x the integer to check
     * @return true if x is positive
     */
    public static boolean isPositive(int x) {
        return x > 0;
    }

    /**
     * Checks whether a number is between 5 and 8
     * or between 15 and 20.
     *
     * @param x the integer to check
     * @return true if the condition is satisfied
     */
    public static boolean isInRanges(int x) {
        return (x > 5 && x < 8) || (x > 15 && x < 20);
    }

    /**
     * Checks whether a number is divisible by both 5 and 7.
     *
     * @param x the integer to check
     * @return true if divisible by both numbers
     */
    public static boolean isDivisibleBy5And7(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    /**
     * Checks whether the second digit of a three-digit number is 7.
     *
     * @param x the three-digit integer
     * @return true if the second digit is 7
     */
    public static boolean hasSecondDigit7(int x) {
        return (Math.abs(x) / 10) % 10 == 7;
    }

    /**
     * Checks whether a point is inside a circle centered at (0, 5).
     * Assumes the radius is 5.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @return true if the point is inside the circle
     */
    public static boolean isInsideCircle(double x, double y) {
        return x * x + (y - 5) * (y - 5) < 25;
    }

    /**
     * Finds the largest of three integers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the largest number
     */
    public static int maxOfThree(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    /**
     * Checks whether a year is a leap year.
     *
     * @param year the year to check
     * @return true if the year is a leap year
     */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * Prints numbers from 1 to 200.
     */
    public static void printNumbers() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    /**
     * Prints the first digit of a given integer.
     *
     * @param x the integer
     */
    public static void printFirstDigit(int x) {
        long number = Math.abs((long) x);

        while (number >= 10) {
            number /= 10;
        }

        System.out.println(number);
    }

    /**
     * Prints x + y while x is less than 5
     * and y is less than 10.
     */
    public static void printSum() {
        int x = 1;
        int y = 0;

        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    /**
     * Prints a square using the * symbol.
     */
    public static void printSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Reads N and calculates the sum of numbers
     * divisible by 5 from 1 to N.
     */
    public static void sumDivisibleBy5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 5; i <= n; i += 5) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }

    /**
     * Reads N and calculates the product of all
     * two-digit even numbers from 1 to N.
     */
    public static void productEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scanner.nextInt();

        long product = 1;

        for (int i = 10; i <= n && i <= 98; i += 2) {
            product *= i;
        }

        System.out.println("Product: " + product);
    }

    /**
     * Finds the minimum and maximum numbers from 1 to N
     * and calculates their arithmetic mean.
     *
     * @param n the upper limit
     */
    public static void meanMinMax(int n) {
        if (n < 1) {
            System.out.println("N must be positive.");
            return;
        }

        int min = 1;
        int max = n;

        double mean = (min + max) / 2.0;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Arithmetic mean: " + mean);
    }

    /**
     * Calculates the sum of digits of a five-digit integer.
     *
     * @param n the five-digit integer
     * @return the sum of its digits
     */
    public static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    /**
     * Tests the methods of the StatementsUtil class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        System.out.println("1. " + isEven(8));
        System.out.println("2. " + isPositive(-3));
        System.out.println("3. " + isInRanges(7));
        System.out.println("4. " + isDivisibleBy5And7(35));
        System.out.println("5. " + hasSecondDigit7(974));
        System.out.println("6. " + isInsideCircle(0, 5));
        System.out.println("7. " + maxOfThree(4, 9, 6));
        System.out.println("8. " + isLeapYear(2024));

        System.out.println("11. Numbers from 1 to 200:");
        printNumbers();

        System.out.println("12. First digit:");
        printFirstDigit(5824);

        System.out.println("13. Sum:");
        printSum();

        System.out.println("14. Square:");
        printSquare();

        System.out.println("15. Sum of multiples of 5:");
        sumDivisibleBy5();

        System.out.println("16. Product of two-digit even numbers:");
        productEvenNumbers();

        System.out.println("17. Minimum, maximum and mean:");
        meanMinMax(10);

        System.out.println("18. Sum of digits:");
        System.out.println(sumDigits(12345));
    }
}
