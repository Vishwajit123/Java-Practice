import java.util.Scanner;
class TwistedPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int den = 2;
        while(den <= n/2){
            if(n % den == 0){
                break;
            }
            den++;
        }
        if(den > n/2){
        int rev = 0;
        for(int i = n; i > 0; i/=10){
           rev = rev * 10 + i % 10;
        }

            den = 2;
        while(den <= rev/2){
            if(rev % den == 0){
                break;
            }
            den++;
        }
        if(den > rev/2){
            System.out.println("It is Twisted Prime number");
            
        }
        else{
            System.out.println("It is not Twisted Prime number");
           
        }
    }
    }
}