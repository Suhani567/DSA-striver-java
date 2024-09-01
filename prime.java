import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
         try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        var count =0;
        for(int i=1;i<=n;i++){
              if(n%i==0){
                count++;
              }
            }
              if(count==2){
                System.out.print(n + " is a prime no. ");
              }
              else{
                System.out.print( n +" is a not a prime no. ");
              }
         }
    }
}
