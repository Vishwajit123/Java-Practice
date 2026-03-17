import java.util.Scanner;
class UglyNo{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        while(n > 1)
        if(n % 2 == 0){
            n/=2;
        }
         else if(n % 3 == 0){
            n/=3;
        }
        else if(n % 5 == 0){
            n/=5;
        }
        else{
            break;
        }
    
        if(n == 1){
            System.out.println("It is the Ugly number");
        }
        else{
            System.out.println("It is the not Ugly number");
        }
    }
}