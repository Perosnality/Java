import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        int pwd;
        System.out.print("Enter Pasword=");
        Scanner obj=new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==1911)
        {
            System.out.println("My name is Prabin");
        }
        else{

            System.out.println("Wrong Password11");
        }
    }
    
}