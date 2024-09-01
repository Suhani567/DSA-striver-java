import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int n = scanner.nextInt(); 
         
         /*
          E
          DE
          CDE
          BCDE
          ABCDE
            */
          for(int i=0;i<n;i++){
            //i=2
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
            scanner.close();
    }
}
}
