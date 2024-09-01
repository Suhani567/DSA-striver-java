import static java.lang.Math.sqrt;
import java.util.Scanner;

public class factors {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        for(int i=1;i<=sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
            if(n/i!=i){
               System.out.print(n/i+" "); 
            }

        }
    }
   
}
}
