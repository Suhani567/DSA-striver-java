// import java.util.Scanner;

// public class countDigit {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("enter any number:");
//         int n= scanner.nextInt();
        
//         int count=0;
//         while(n>0){
            
//             // System.out.print(lastdigit);//prints in reverse
//             count=count+1;
//             n=n/10;
//             scanner.close();
//         }
//         System.out.print(count);
//     }
// }
import static java.lang.Math.log10;
import java.util.*;

public class countusinglog{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter any number: ");
            int n = scanner.nextInt();

            int count = (int)(log10(n) + 1);
            System.out.print("Number of digits: " + count);
        }
    }
}
