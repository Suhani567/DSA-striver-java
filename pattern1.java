import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        //outer loop is for lines-->count the number of lines 
        //inner loop is for the rows-->focus of the columns and connect them somh to the rows
        // print them "*" inside the inner for loop
        //observe symmetry (optional)

        //Q1.
        // ****
        // ****
        // ****
        // ****
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        for(int i=0;i<rows;i++){
          for(int j=0;j<columns;j++){
            System.out.print("*");
          }
          System.out.println();
          scanner.close();
        }
    }

}
