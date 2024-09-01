import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if (dup == revNum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    }
}
