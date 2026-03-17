import java.util.Scanner;
class Automorphic{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        
        int power = 1;
        for(int  i = n; i > 0; i/=10){
            power*= 10;
        }
         int sq = n * n;
    int ld = sq % power;

    if(n == ld){
        System.out.println("It is Automorphic number");
    }
    else{
        System.out.println("It is not Automorphic number");
    }
    }
}