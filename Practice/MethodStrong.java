class MethodStrong{
    public static void main(String[] args){
        System.out.println(isStrongNumber(145));
    }
    public static boolean isStrongNumber(int num){
        int sum=0;
        for(int i=num; i>0; i/=10){
            int ld= i%10;
                sum +=factorial(ld);
        }
        return sum == num;
    }
    public static int factorial(int num){
        int fact=1;
        while(num > 0){
            fact*=num;
            num--;
        }
        return fact;
    }
}