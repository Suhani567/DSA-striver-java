import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        /*
         4444444      0000000
         4333334      0111110
         4322234      0122210
         4321234      0123210
         4322234      0122210
         4333334      0111110
         4444444      0000000
         */
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int down =(2*n-2)-i;
                
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));

            }
            System.out.println();
            scanner.close();
        }
    }
}
