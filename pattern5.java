
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        /*
        
         ***
         **
         *
         
         */
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the value of n");
         int n= sc.nextInt();

         for (int i = 1; i <=n; i++) {
            for (int j = 0 ; j< n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
         }

    }
}
