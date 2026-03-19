import java.util.Scanner;
class ArmstrongRange{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number:");
        int end = sc.nextInt();

        while(start <= end){
        int sum = 0;
        int cnt = 0;
        int n = start;
        int temp =n;
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
             
        }
    
           
        
        if(sum == temp){
            System.out.println(temp + " Armstrong Number");
        }
       
        start++;
    }
}
}