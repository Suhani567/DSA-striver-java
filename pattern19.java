
import java.util.Scanner;

public class pattern19 {

    public static void main(String[] args) {
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        //1. loop for the upper half 
        int space = 0;
        for (int i =0 ; i <n; i++) {
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        //lower half
        space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
            scanner.close();
        }
    }
}
