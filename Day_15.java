//Day 15: Create a class to represent a Book with attributes title, author, and price.
class Book{
    void deatails(){
        String title ="Head First Java ";
        String author="Kathy Sierra";
        double price=1800.0;
        System.out.println(title);
        System.out.println("author is "+author);
        System.out.println("price :"+price);
    }
}
public class Day_15 {
    public static void main(String[] args) {
        Book b=new Book();
        b.deatails();
    }
    
}