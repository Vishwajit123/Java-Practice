class MethodPrime{
    public static void main(String[] args){
        System.out.println(isPrime(30));
        System.out.println(RangeOfPrime(10,30));
    }
    public static boolean isPrime(int num){
        int i = 2;
        if(num < 2) return false;
        while(i < num){
            if( num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int RangeOfPrime(int start, int end){
        int count=0;
        for(int num=start; num <= end ; num++){
            if(isPrime(num)){
                System.out.print(num + " ");
                count++;
            }
        }
        return count;
    }
    
}