
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
/*
          *        [2,1,2]
         ***       [1,3,1]
        *****      [0,5,0]

        [space,stars,space]
        [n-i-1,2*i+1,n-i-1]
*/
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the no of rows");
    int n= sc.nextInt();

    for (int i = 0; i < n; i++) {
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //star
        for (int j = 0; j < 2*i+1; j++) {
            System.out.print("*");
        }
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
        sc.close();
        
     }

   }
}
