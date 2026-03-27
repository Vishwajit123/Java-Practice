class March28{
    public static void main(String[] args){
          
           System.out.println(isPrime(12));
            System.out.println(reverse(123));
            System.out.println(twistPrime(12));
    }
    public static boolean twistPrime(int  num){
       
      if(isPrime(num) && isPrime(reverse(num))){
            return true;
      }
      return false;

    }
  
    public static boolean isPrime(int num){
        int den=2;
        if(num < 2) return false;
        while(den < num){
            if(num % den==0){
                return false;
            }
            den++;
           
        }
         return den==num;
    }
    public static int reverse(int num){
            int rev=0;
           for(int i=num; i>0; i/=10){
            rev = rev *10 +i%10;
           }
           return rev;
    }
    
}