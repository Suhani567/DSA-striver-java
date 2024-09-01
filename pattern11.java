import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        /*
         * 
         * 1
         * 01
         * 101
         * 0101
         * 
         */

        for (int i = 1; i <= n; i++) {
            int start = 1; // Always start with 1
            
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start; // Toggle between 1 and 0
            }
            System.out.println();
        }
        
        scanner.close(); // Close the scanner after all input is taken
    }
}
