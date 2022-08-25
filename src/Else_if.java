import java.util.Scanner;
public class Else_if {
    public static void main(String[] args) {
        int marks;
        System.out.println("enter the marks of the student ");
        Scanner s=new Scanner(System.in);
        marks=s.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.println("First division");
        }
        else if(marks>=45 && marks<=60)
        {
            System.out.println("Second division");
        }
        else if(marks>=30 && marks<=60)
        {
            System.out.println("Third division");
        }
        else{
            System.out.println("Failed");
        }
    
    }
    
}
