//Day 10: Check if an array is sorted.
public class Day_10 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int ele=arr[0];
        int Check=1;
        for (int num : arr) {
            if (num<ele) {
                Check=0;
            }
            }
                if (Check==1) {
                    System.out.println("array is shorted");
                }else{
                    System.out.println("Array is not shorted");
                }
    }
}