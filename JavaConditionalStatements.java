public class JavaConditionalStatements {
    public static void main(String[] args) {
        // if-else statements
        int age = 18;
        if(age >= 18){
            System.out.println("You can vote now.");
        }else {
            System.out.println("You cannot vote now.");
        }

        // if-else if-else statements
        int day = 3;
        if(day == 1){
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        }else {
            System.out.println("Good Day");
        }

        // nested if-else statements
        int a=20, b=70, c=34;

        if(a > b){
            System.out.println("a is bigger than a");
            if(a > c){
                System.out.println("a is bigger than c");
                System.out.println("a is largest: " + a);
            }else{
                System.out.println("c is bigger than a");
                System.out.println("c is largest: " + c);
            }
        }else{
            System.out.println("b is bigger than a");
            if(b > c){
                System.out.println("b is bigger than c");
                System.out.println("b is largest: " + b);
            }else{
                System.out.println("c is bigger than b");
                System.out.println("c is largest: " + c);
            }
        }

        // ternary operator
        int maxNumber = a>b?a:b;
        System.out.println("Max1: " + maxNumber);

        int maxNumber2 = a > b ? a > c ? a : c: b > c ? b : c;
        System.out.println("Max2: " + maxNumber2);
    }
}
