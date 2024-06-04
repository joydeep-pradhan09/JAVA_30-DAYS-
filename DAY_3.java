// Check if a number is even or odd.
import java.util.Scanner;
public class DAY_3 {
    public static void main(String[] args) {
        System.out.println("enter a number :");
        Scanner sc=new Scanner(System.in);// crate object of scanner class 
        int a =sc.nextInt(); // take input from user and store it 
        sc.close();
        if (a%2==0){ // make a condition statement 
            System.err.println("its a even number ");
        }else{
            System.out.println("its a odd number ");
        }
    }
}