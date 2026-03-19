import java.util.Scanner;
class ArmstrongRange{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int n= sc.nextInt();
     
         
        int cnt = 0;
       int num=1;
        while(cnt < n){
        int temp =num;
        int sum = 0;
        int digits = 0;
        for(int i = n; i > 0; i/=10){
           digits++;
        }
         for(int i = n; i > 0; i/=10){
           int ld = i % 10;
        
          int power = 1;
            for( int j = 1; j <= cnt; j++ ){
                power *= ld;
                
            }
             sum += power;
             
        }
    
           
        
        if(sum == temp){
            cnt++;
            if(cnt == n){
            System.out.println(temp + " Armstrong Number");
            break;
            }
        }
       
        num++;
    }
}
}