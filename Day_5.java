//**Day 5:** Print the multiplication table of a number
import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc =new Scanner(System.in);
        sc.close();
        int num= sc.nextInt();
        for (int i=0;i<10;i++){
            System.out.println(num*i);
        }
    }
}