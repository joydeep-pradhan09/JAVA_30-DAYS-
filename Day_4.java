import java.util.Scanner; // Import Scanner class for input
public class Day_4 {
    public static void main(String[] args) {
        System.out.println("enter three number :");
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int a = sc.nextInt(); // Read first number
        int b = sc.nextInt(); // Read second number
        int c = sc.nextInt(); // Read third number
        sc.close(); // Close Scanner

        // Determine the largest number
        if (a > b) { // Check if 'a' is greater than 'b'
           if (a > c) { // If 'a' is also greater than 'c', then 'a' is the largest
                System.out.println(a + " is largest number ");
           }else { // If 'a' is not greater than 'c', then 'c' must be the largest
                System.out.println(c + " is greater");
           }
        } else { // If 'a' is not greater than 'b'
            if (b > c) { // Check if 'b' is greater than 'c'
                System.out.println(b + " is greater "); // If 'b' is greater than 'c', then 'b' is the largest
            } else { // If 'b' is not greater than 'c', then 'c' must be the largest
                System.out.println(c + "is greater"); // Print that 'c' is the largest number
        }
    }
}
}