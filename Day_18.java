//Day 18: Implement inheritance by creating a subclass Circle from a superclass Shape.
class Shape{
    public void data(){
        String  clr="black";
        String shape="3d";
        System.out.println("colour of object is "+clr);
        System.out.println("shape of object is "+shape);
    } 
}
class Circle extends Shape{
    void cal(){
        int r=7;
        System.out.println("Area of circle is "+3.14*(r*r));
        System.out.println("perimeter of circle "+2*3.14*r);
    }
}
public class Day_18 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.data();
        c.cal();
    }
}