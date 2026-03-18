import java.util.Scanner;
class Armstrong{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        for(int i = n; i > 0; i/=10){
           cnt++;
        }
         for(int i = n; i > 0; i/=10){
           int ld = i % 10;
        
          int power = 1;
            for( int j = 1; j <= cnt; j++ ){
                power *= ld;
                
            }
             sum += power;
             count--;
        }
           
        
        if(sum == n){
            System.out.println("Armstrong Number is found");
        }
        else{
            System.out.println("Armstrong Number is not  found");
        }
    }
}