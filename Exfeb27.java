import java.util.Scanner;
public class Exfeb27 {
    public static void main(String[] args) {
        int esum = 0, osum = 0;
        int ec = 0, oc = 0;
        System.out.print("Enter the value :-");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = n; i > 0; i /= 10) {
            
            int ld = i % 10;
            if (ld % 2 == 0){
                esum += ld;
                ec++;
            }
                
            else{
                 osum += ld;
                oc++;
            }
               
        }
        int eavg = esum / ec;
        int oavg = osum / oc;
        System.out.println("The sum of even numbers is " + esum);
        System.out.println("The sum of odd numbers is " + osum);
        System.out.println("The avg of the even numbers " + eavg);
        System.out.println("The avg of the odd numbers " + oavg);

    }
}

public class Exfeb27 {
    public static void main(String[] args) {
        // logic to get prnt the digits in the number in same order
        System.out.print("Enter the value :-");
        int num = new java.util.Scanner(System.in).nextInt();
        int div = 1, len = 0;
         for (int i = num; i > 0; i /= 10) {
            len++;
        }
        for (int i = 1; i <= len; i++) {
            div *= 10;
        }
        for (int i = num; i != 0; i %= div) {
            div /= 10;
            int fd = i / div;
            System.out.print(fd + "_");
        }
    }
}

class Exfeb27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        int cnt = 0;
        int sum = 0; 
        int pro = 1;
        int avg = 0;
        for(int i = num ; i > 0; i /= 10 ){
            cnt++;
            int ld = i % 10;
            sum += ld;
            pro *= ld;
            avg = sum / cnt;
            System.out.println(ld + " ");
        }
            
            System.out.println("The count of the number is:" + cnt);
            System.out.println("The sum of the digits is: " + sum);
            System.out.println("The product of the digits is: " + pro);
            System.out.println("The avg of the digits is: " + avg);


    }
}

class Exfeb27{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();
        
        String words = "";
        for(int i = num; i > 0 ; i /= 10){
            int digit = i % 10;
         String word = switch(digit){
            case 1 -> "One ";
            case 2 -> "Two ";
            case 3 -> "Three ";
            case 4 -> "Four ";
            case 5 -> "Five ";
            case 6 -> "Six ";
            case 7 -> "Seven ";
            case 8 -> "Eight ";
            case 9 -> "Nine ";
            case 0 -> "Zero ";

            default -> "";
         };
            words = word + words;
        }
        System.out.println(words + " ");
    }
}