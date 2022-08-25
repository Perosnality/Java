import java.util.Scanner;
public class If_Else_If {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter three number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is the greater number= " +a);
            }
            else
            {
                System.out.println("b is the greater number =" +b);
            }
        }
        else{
            if(b>c)
            {
                System.out.println("b is the greater number= "+b);
            }
            else
            {
                System.out.println("c is the greater number= " +c);
            }










        }

        


    }
    
}
