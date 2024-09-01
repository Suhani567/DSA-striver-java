import java.util.Scanner;
public class pattern18a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (char ch = (char)('A' + N - 1); ch >= 'A' + (N - 1 - i); ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();

            scanner.close();
        }
    }
}


