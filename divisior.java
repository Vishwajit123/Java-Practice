import java.util.Scanner;
class divisior{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int len = 0;
        
        for(int i = num ; i > 0 ; i /= 10){
            len++;
        }
        int div = 1;
        for(int i = 1; i <= len; i++){
            div  *= 10;
        }

       
        for(int i = num; i != 0; i %= div){
            div /= 10;
            int fd = i / div;
            System.out.print(fd +" _ ");
            
        }
        
    }
}