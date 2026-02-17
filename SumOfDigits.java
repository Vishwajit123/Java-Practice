import java.util.*;
class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int dup = num;
        int rem = 0;
        int sum = 0;

        rem = num%10;
        sum = sum + rem ;
        num = num /10 ;

        rem = num%10;
        sum = sum + rem ;
        num = num /10 ;


        rem = num%10;
        sum = sum + rem ;
        num = num /10 ;

        System.out.println(dup + " : "+sum);
    }
}