//Find the largest and smallest element in an array.
public class Day_9 {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,06,07,80,89};
        int largest=arr[1];
        int small=arr[1];
        
        for(int num : arr){
            if(num<small){
                small=num;
            }
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("smallest number is "+small);
        System.out.println("largest number is "+largest);
    }
}