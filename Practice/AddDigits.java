import java.util.Scanner;
class AddDigits{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0 && num < 1000){
            int rem = num % 10 ;
            sum += rem ;
            num = num / 10 ;
        } 

        System.out.println("The sum of the Digit " + sum);
    }
}