
import java.util.Scanner;

public class pattern3 {
    /*
     1
     12
     123
     1234
     12345
     */
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.print("Enter the no. of rows");
         int rows= scanner.nextInt();
         for (int i = 1; i <= rows; i++) {
            for(int j=1;j<=i;j++){
               System.out.print(j);
            }
            System.out.println();
            scanner.close();
         }
     }

}
