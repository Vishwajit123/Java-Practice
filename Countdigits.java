import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=scanner.nextInt();
        int count=0;
        int temp=Math.abs(number);

        if(temp==0){
            count=1;
        }
        else{
            while(temp>0){
            temp=temp/10;
            count++;
        }
    }
                System.out.println("The number of digits:"+ count);

    }
    
}
