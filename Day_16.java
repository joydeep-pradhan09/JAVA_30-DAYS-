/*Day 16: Create a class to represent a Student with attributes 
          name, roll number, and marks. Include a method to display the student's details.*/
class Student{
    void dis(){
        String name="joydeep Pradhan";
        String roll="2302910018";
        double mark =8.9;

        System.out.println("name :"+name);
        System.out.println("roll :"+roll);
        System.out.println("mark :"+mark+" cgpa");
    }
}
public class Day_16 {
    public static void main(String[] args) {
        Student s=new Student();
        s.dis();
    }
}
