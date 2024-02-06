public class Patterns {
    public static void main(String[] args) {
        // 1st pattern
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        // 2nd pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        // 3rd pattern
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        // 4th pattern
        for(int i=1;i<=5;i++){
            for (int j=1; j<=5-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }


        System.out.println("----------------------------------");


        // 5th pattern
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        // 6th pattern
        for(int i=0;i<5;i++){
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<=2*i-1;j++){
                if(j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=5-2; i>=0;i--){
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<=2*i-1;j++){
                if(j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
