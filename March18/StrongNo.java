import java.util.Scanner;
class StrongNo{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = n; i > 0; i/=10){
            int ld = i % 10;
        
        int fact = 1;
        for(int j = ld; j > 1; j-- ){
            fact *= j;
        }
        sum += fact;
    }
        if(sum == n){
            System.out.println("Number is strong number");
        }
        else{
            System.out.println("Number is not strong number");
        }
       
    }
}