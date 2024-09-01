import java.util.Scanner;

public class pattern14 {
    /*
     A
     AB
     ABC
     ABCD
     ABCDE
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int n = scanner.nextInt();

         for(int i=0;i<n;i++){
            //i=2
            for(char ch='A'; ch<='A' + i; ch++ ){
                System.out.print(ch +" ");
                }
                System.out.println();
                scanner.close();
            }
         }
    }

