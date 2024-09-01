import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
       /*

       1.*        *     1 8 1
       2.**      **     2 6 2
       3.***    ***     3 4 3
       4.****  ****     4 2 4
       5.**********     5 0 5
       6.****  ****     4 2 4 
       7.***    ***
       8.**      **
       9.*        *
       
       */ 
        int spaces =2*n-2;
        for(int i=1; i<=2*n-1; i++){
        int stars= i;
        if(i>n) {
            stars =2*n-i;
        }
        //stars
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=stars;j++){
           System.out.print("*");
        }
        System.out.println();

        if(i<n){
            spaces-=2;
        }
        else{
            spaces+=2;
        } 
        scanner.close();
      }
      
   }
}
