import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int den = 2;
        while(den <= n/2){
            if(n % den ==0){
                break;
            }
            den++;
        }
        if(den > n/2){
            System.out.println("It is Prime number");
        }
        else{
            System.out.println("It is not Prime number");
        }
}
}