import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Relational operators
        System.out.println("Relational Operators:");
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or equal to: " + (num1 >= num2));
        System.out.println("Less than or equal to: " + (num1 <= num2));
        System.out.println();

        // Logical operators
        System.out.println("Logical Operators:");
        boolean condition1 = (num1 > 0);
        boolean condition2 = (num2 > 0);
        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));
        System.out.println("Logical NOT: " + (!condition1));
        System.out.println();

        // Bitwise operators
        System.out.println("Bitwise Operators:");
        System.out.println("Bitwise AND: " + (num1 & num2));         // Performs a bitwise AND
        System.out.println("Bitwise OR: " + (num1 | num2));          // Performs a bitwise OR
        System.out.println("Bitwise XOR: " + (num1 ^ num2));         // Performs a bitwise XOR
        System.out.println("Bitwise NOT: " + (~num1));               // Performs a bitwise NOT (complement)
        System.out.println("Left shift: " + (num1 << 2));            // Shifts bits of num1 to the left by 2 positions
        System.out.println("Right shift: " + (num1 >> 2));           // Shifts bits of num1 to the right by 2 positions
        System.out.println("Unsigned right shift: " + (num1 >>> 2)); // Shifts bits of num1 to the right by 2 positions, zero-fill
        System.out.println();

        // Assignment operators
        System.out.println("Assignment Operators:");
        int num3 = num1;
        num3 &= num2;
        System.out.println("Bitwise AND assignment: " + num3);
        num3 |= num2;
        System.out.println("Bitwise OR assignment: " + num3);
        num3 ^= num2;
        System.out.println("Bitwise XOR assignment: " + num3);
        num3 <<= 2;
        System.out.println("Left shift assignment: " + num3);
        num3 >>= 2;
        System.out.println("Right shift assignment: " + num3);
        num3 >>>= 2;
        System.out.println("Unsigned right shift assignment: " + num3);
        System.out.println();

        // Unary operators
        System.out.println("Unary Operators:");
        int num4 = num1;
        System.out.println("Unary plus: " + (+num4));
        System.out.println("Unary minus: " + (-num4));
        System.out.println("Increment: " + (++num4));
        System.out.println("Decrement: " + (--num4));
        System.out.println("Post-increment: " + (num4++));
        System.out.println("Post-decrement: " + (num4--));
        System.out.println();

        // Ternary operator
        System.out.println("Ternary Operator:");
        String result = (num1 > num2) ? "num1 is greater" : "num2 is greater or equal";
        System.out.println("Result: " + result);

        scanner.close();
    }
}
