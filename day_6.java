//Day 6: Check if a number is a prime number.
public class day_6 {
    public static void main(String[] args) {
        int a=7;
        int r=0;// counts reminders 
        for(int i=1;i<=a;i++){
            if(a%i==0){ // if reminder is zero that mean it divisible by i
                r++;
            }
        }
        if(r==2){  // prime number is divisible by 1 & it self
            System.out.println("prime number");
        }else{
            System.out.println("normal number ");
        }
    }
}