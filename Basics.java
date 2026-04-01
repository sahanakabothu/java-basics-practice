import java.util.*;

public class Basics {
    public static void main(String[] args) {

        //  LOOPS
        System.out.println("Loops Example:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // ARRAYS
        System.out.println("\nArray Example:");
        int arr[] = {10, 20, 30, 40};
        for(int num : arr) {
            System.out.println(num);
        }

        //  STRINGS
        System.out.println("\nString Example:");
        String name = "Sahana";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());

        //  USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
