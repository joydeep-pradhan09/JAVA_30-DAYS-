//Calculate the factorial of a number.
public class Day_7 {
    public static void main(String[] args) {  
        int a = 2;
        int fac=0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if((i*j)==a){
                  fac++;
                }
            }
        }
        System.out.println("number of factorial:"+fac);
    }
}