import java.util.Scanner;

public class hcfOrGcd {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter any number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        //hcf = highest common factor
        // 9= 1,3,9;
        // 12= 1,2,3,4,6,12;
        // gcd(9,12)= 3

        // for (int i = 1; i < min(n1,n2); i++) {
        //     if(n1%i==0 && n2 %i ==0){
        //         gcd = i;
        //     }
        // }
       //euclidean algorithm
    //    gcd(a,b)=gcd(a-b,b)
    // or gcd(a,b)==gcd(a%b,b)
    // greater%smaller = 0
    
    //    both are equal and in the end the number b is left as the other on eis bought to 0
           
            while (a > 0 && b > 0) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            }
            // Once the loop ends, one of a or b will be zero, so return the non-zero one.
            if (a == 0) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }		
    }
}
    
