import java.util.*;
class DecimaltoBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int rem = 0;
        String binary = "";
        while(number > 0){
            rem = number % 2;
            binary = rem + binary;
            number = number/2;
        }
        System.out.println(binary);
    }
}