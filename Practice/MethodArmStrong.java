class MethodArmStrong{
    public static void main(String [] args){
        System.out.println(isArmstrongNumber(153));
    }
    public static boolean isArmstrongNumber(int num){
        int sum=0;
        for(int i=num; i>0; i/=10){
            sum+=power(i%10, count(num));
        }
        return num==sum;
    }
    public static int count(int num){
        int cnt=0;
        for(int i=num; i>0; i/=10){
            cnt++;
        }
        return cnt;
    }
    public static int power(int base, int raise){
        int pow=1;
        while(raise >0){
            pow*=base;
            raise--;
        }
        return pow;
    }
}