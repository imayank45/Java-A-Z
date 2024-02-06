public class ArraysInJava {
    public static void main(String[] args) {

        // 1D arrays
        int age[] = new int[5];

        age[0] = 5;
        age[1] = 8;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age.length);

        int marks[] = {12,20,24,21,33};
        System.out.println(marks[3]);

        String names[] = {"ram","shyam","manish","rohit"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is " + names[i]);
        }

        for(String name: names){
            System.out.println(name);
        }

        // 2D array

        int nums[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(nums[2][1]);

        int k[][] = {
                {1,2,3},
                {4,5}
        };
        System.out.println(k[1].length);
    }
}
