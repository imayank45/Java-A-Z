import java.util.Scanner;
public class LoopsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For loop
        System.out.println("Enter a number to print a table: ");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }


        // While loop
        int count = 0;
        while(count <= 6){
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While loop
        count = 0;
        do {
            System.out.println("Hi, I am Mayank.");
            count++;
        }while (count <= 5);
    }
}
