//Day 17: Create a class to represent a Rectangle and calculate its area and perimeter
class Rectangle{
    void area(int l,int b){
        System.out.println("area of rectangle is "+l*b);
        System.out.println("perimeter of rectangle is "+2*(l+b));
    }
}

public class Day_17 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area(5, 3); 
    }
}