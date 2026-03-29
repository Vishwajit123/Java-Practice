class RotatingPrime{
    public static void main(String [] args){
    //   System.out.println(isPrime(12));
      System.out.println(isRotatingPrime(19));
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        
            int i = 2;
            while(i < num){
                if(num % i == 0){
                    return false;
                }
                i++;
            }
            return true;
    }
    public static boolean isRotatingPrime(int num){
         int rot = rotate(num);
        if(isPrime(num)){
            while(rot != num){
                if(isPrime(rot)){
                    rot = rotate(rot);
                }
                else{
                    break;
                }
            }
        }
        return num==rot;
    }
    public static int power(int num){
        int pow=1;
        while(num > 0){
            pow*=10;
            num/=10;
        }
        return pow;
    }
    public static int rotate(int num){
        return (num%10 * power(num/10)) + num/10;
    }
}