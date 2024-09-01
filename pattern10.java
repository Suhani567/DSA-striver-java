import java.util.Scanner;
public class pattern10 {

    public static void main(String[] args) {
            // *
            // **
            // ***
            // ****
            // *****
            // ****
            // ***
            // **
            // *
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n=scanner.nextInt();
    
            //generte the pattern (upper half)
            for (int i = 1; i <= n; i++) {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
              //generate the pattern (bottom half)  
                for(int i=n-1; i>=1; i--){
                    for(int j=1;j<=i;j++){
                    System.out.print("*");  
               
            }
              System.out.println();
              scanner.close();
     }
    }
}


