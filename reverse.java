import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int revnum=0;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            revnum=(revnum*10)+lastdigit;
            sc.close();
        }
        System.out.print(revnum);
    }
}
