import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int n = scanner.nextInt(); 

         /*
           A
          ABA
         ABCBA 
          */
         for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
            }

            //alphabets
            char ch='A';
            int breakpoint= (2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
        scanner.close();
        }
    
}
