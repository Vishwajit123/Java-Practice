import java.util.*;
class ProductOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int dup = num;
        int rem = 0;
        int pro = 1;

        rem = num%10;
        pro = pro * rem ;
        num = num /10 ;

        rem = num%10;
        pro = pro * rem ;
        num = num /10 ;


        rem = num%10;
        pro = pro * rem ;
        num = num /10 ;

        System.out.println(num + " : "+pro);
    }
}