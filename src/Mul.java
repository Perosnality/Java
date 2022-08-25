import java.util.Scanner;
public class Mul {
    public static void main(String[] args) {
        int num,i;
        System.out.println("Enter any numbers");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(i=0; i<=10; i++)
        {
            System.out.println(num*i);
        }
    }
}
