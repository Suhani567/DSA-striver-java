
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        
        /*
                   [number , space , number]
                   
         1      1   [1,     6,     1]
         12    21   [2,    4,     2]
         12344321    ``````````````
         

         */

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int n = scanner.nextInt();
          int space =2*(n-1);
          for(int i =1;i<=n;i++){
        //   numbers
            for(int j=1;j<=i;j++){

              System.out.print(j);
            }
          

          // space
          for(int j=1;j<=space;j++){
            System.out.print(" ");
          }
          //number
          for(int j =i;j>=1;j--){
            System.out.print(j);
          }

          System.out.println();
          space-=2;
          scanner.close();
          
        }
 }
}
