//Reverse an array
public class Day_8 {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9}; // array declaration and initialization
        int rev[]=new int[10]; // array initialization
        int n=0;

        // loop for reverers array
        for(int i=9;i>=0;i--){
            rev[n]=arr[i]; // it goes like rev[1]=arr[9] then rev[2]=arr[8].....
            n++;
        }

        // Print  reversed array 
        for (int num : rev) {
            System.out.println(num);
        }
    }
}