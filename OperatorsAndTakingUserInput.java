import java.util.Scanner;

public class OperatorsAndTakingUserInput {
    public static void main(String[] args) {

        // arithmetic operators
        System.out.println("Arithmetic operators: ");
        // addition
        int a = 13;
        int b = 42;
        int result1 = a + b;
        System.out.println("Addition: " + result1);

        // subtraction
        int d = 23;
        int c = 34;
        int result2 = c - d;
        System.out.println("Subtraction: " + result2);

        // multiplication
        int e = 12;
        int f = 6;
        int result3 = e * f;
        System.out.println("Multiplication: " + result3);

        // division
        int g = 6;
        int h = 44;
        double result4 = (double)h/g;
        System.out.println("Division: " + result4);

        // modulo
        int i = 9;
        int j = 889;
        int result5 = j%i;
        System.out.println("Modulo: " + result5);

        // assignment operators
        System.out.println("Assignment operators: ");

        a = b;
        System.out.println("a=b : " + a);
        a += c;
        System.out.println("a += c : " + a);
        a -= i;
        System.out.println("a -= i : " + a);
        a *= 2;
        System.out.println("a *= 2 : " + a);
        a /= 10;
        System.out.println("a /= 10 : " + a);
        a %= 4;
        System.out.println("a %= 4 : " + a);

        // relational operators
        System.out.println("Relational operators: ");
        int age = 20;
        int weight = 40;
        System.out.println(age == weight);
        System.out.println(age != weight);
        System.out.println(age > weight);
        System.out.println(age < weight);
        System.out.println(age >= weight);
        System.out.println(age <= weight);

        // logical operators

        System.out.println("Logical operators: ");
        boolean expression1 = true;
        boolean expression2 = false;

        System.out.println(expression1 && expression2);
        System.out.println(expression1 || expression2);
        System.out.println(!expression1);

        // Increment and Decrement operaotrs

        int x = 100;
        x++;
        System.out.println("Increment: " + x);
        x--;
        System.out.println("Decrement: " + x);


        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height: ");
        int height = sc.nextInt();
        System.out.println("Your height is " + height);
    }
}
