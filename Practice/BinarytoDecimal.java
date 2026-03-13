import java.util.*;
class BinarytoDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int binary = sc.nextInt();
        int number = 0;
        int power = 0;
        while(binary > 0){
            int lastdigit = binary % 10;
            number += lastdigit * Math.pow(2,power);
            power++;
             binary/=10;
        }
        System.out.println(number);
    }
}