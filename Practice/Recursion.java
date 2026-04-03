class Recursion{
    public static void main(String[] args){
        System.out.println(fact(5));
        System.out.println(count(2341, 0));
        System.out.println(reverse(123,0));
        System.out.println(power(2, 4));
        System.out.println(145 == strong(145));
        System.out.println(armStrong(153));
        System.out.println(rotate(123));
        System.out.println(isPrime(27,2));
    }
    public static int fact(int num){
        
        return num == 0 ? 1 : num * fact(num-1);
    }
    public static int count(int num, int cnt){
        return num == 0 ? cnt : count(num/10, cnt+1);
    }
    public static int reverse(int num , int rev){
        return num == 0 ? rev : reverse(num/10, rev * 10 + num % 10);
    }
    public static int power(int base, int raise){
        return raise == 0 ? 1 : base * power(base  , raise - 1);
    }
    public static int strong(int num){
        return num == 0 ? 0 : fact (num % 10) + strong(num/10);
    }
    public static boolean armStrong(int num ){
        return sumOfDigits(num,num,0)== num; 
    }
    public static int sumOfDigits(int num , int temp, int sum){
        return num == 0 ? sum :sumOfDigits(num/10, temp, sum + power(num%10, count(temp,0)));
    }
    public static int rotate(int num){
        return num%10 * power(10, count(num/10, 0))+num/10;
    }
    public static boolean isPrime(int num, int den){
        return num > den ? num % den == 0 ? false : isPrime(num , den+1) : true;
    }
    
}