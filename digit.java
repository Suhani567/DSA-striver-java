
import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        //program to print the digits
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter any number:");
        int n= scanner.nextInt();

        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);//prints in reverse
            n=n/10;
            scanner.close();
        }
    }
}
