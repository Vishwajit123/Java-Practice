import java.util.Scanner;
class TechNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        int cnt = 0;
        for(int i = num; i > 0; i/=10){
            cnt++;
        }
         int power = 1;
        if(cnt % 2 == 0){
           for(int i = 0; i < cnt/2; i++){
                power*=10;
            }
        }
        int last = num % power;
        int first = num / power;
        int sum = last + first;

        if((sum * sum) == num){
            System.out.println("It is tech number");
        }
        else{
             System.out.println("It is not tech number");
        }
    }

}