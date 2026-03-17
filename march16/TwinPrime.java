import java.util.*;
class TwinPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int n2 = sc.nextInt();


           if (n1 < 2 || n2 < 2) {
            System.out.println("Numbers less than 2 are not prime");
            return;
        }
        int den = 2;
        while(den <= n1/2){
            if(n1 % den == 0){
                break;
            }
            den++;
        }
        if(den <= n1/2){
            System.out.println("It is not Prime number:");
            return;
        }
            
        
            den = 2;
            while(den <= n2/2){
                if(n2 % den == 0){
                    break;
                }
                den++;
            }
             if(den <= n2/2){
            System.out.println("It is not Prime number:");
            return;
             }
                int diff = Math.abs(n2 - n1);

                if(diff == 2){
            System.out.println("It is Twin prime number");
        }
        else{
            System.out.println("It is not Twin prime number");
        }
            }
        
        }


// ------------------------------- Best Version Recursion method -------------------------------------------------
import java.util.*;
class March16{
    static boolean TwinPrime(int n){
        if(n < 2) return false;

        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1:");
        int n1 = sc.nextInt();

        System.out.println("Enter the num2:");
        int n2 = sc.nextInt();

        if(TwinPrime(n1) && TwinPrime(n2) && Math.abs(n1-n2 )== 2){
            System.out.println("It is Twin prime number");
        }
        else{
            System.out.println("It is not Twin prime number");
        }
            
    }
}        



