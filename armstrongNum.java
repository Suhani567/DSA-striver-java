import java.util.Scanner;

public record armstrongNum() {
    // 371 = (3)pow3+7(pow3)+1(pow3)=371

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();
        
        int digits=String.valueOf(n).length();

        int sum=0;
        int temp=n;

        while(temp!=0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp=temp/10;

        }
        if(sum==n){
            System.out.print(n + " is an Armstrong number.");
        }
        else{
            System.out.print(n+" is not an Armstrong number");
        }
       scanner.close();
    }
}
}