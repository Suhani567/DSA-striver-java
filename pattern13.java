import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        int num=1;
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(num);
                 num=num+1;
             }
             System.out.println();
             scanner.close();
        }
    }
}
