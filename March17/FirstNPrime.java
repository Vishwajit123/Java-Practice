import java.util.Scanner;
class FirstNPrime{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth prime:");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;
        while(count < n){
            int den = 2;
            while(den <= num/2){
                if(num % den == 0){
                    break;
                }
                den++;
            }
            if(den > num/2){
                System.out.print(num + " ");
                count++;
            }
           
            num++;
        }
      
       
    }
}