import java.util.Scanner;
class March5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        while(num > 0){
            if(num % 10 == digit){
                System.out.println("Digit is Found");
                break;
            }
            num = num / 10;
        }
        if(num == 0)
        System.out.println("Digit is not Found");
    }
}


// ----------------------------------------- Find out the Digit in the Number -----------------------------------

import java.util.Scanner;
class March5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        while(num > 0){
            if(num % 10 == 0){
                System.out.println("Zero is Found");
                break;
            }
            num = num / 10;
        }
        if(num == 0)
        System.out.println("Zero is not Found");
    }
}

// -------------------------------------------- BUZZ NUMBER ----------------------------------------


import java.util.Scanner;
class March5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        while(num > 0){
            if(num % 10 == 7  && num % 7 == 0){
                System.out.println("Buzz Number  Found");
                break;
            }
            num = num / 10;
        }
        if(num == 0)
        System.out.println("Buzz number  is not Found");
    }
}


// --------------------------- SPY NUMBER -------------------------------------------


import java.util.Scanner;
class March5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0 ;
        int pro = 1 ;
        while(num > 0){
            
                sum += num % 10;
                pro *= num % 10;
            
                num = num / 10;
            
        }
        if(sum == pro)
            System.out.println("It is the SPY Number");
           else
            System.out.println("It is not SPY Number");
        
        
    }
}

// --------------------------------------- PERFECT NUMBER -------------------------------------------

import java.util.Scanner;
class March5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num / 2){
           if(num % i == 0){
            sum += i;
           }
           i++;
        }
        
        if(num == sum){
            System.out.println("It is Perfect number");
        }
        else{
             System.out.println("It is not Perfect number");
        }
    }

}

// ---------------------------------   POWWER OF NUMBER ----------------------------------------


import java.util.Scanner;
class March5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base =  sc.nextInt();
        System.out.print("Enter the power : ");
        int power = sc.nextInt();
        int pro = 1;
        while(power > 0){
            pro = pro * base;
            power --;
        }
        System.out.println("The power of the number is " + pro);

    }
}
