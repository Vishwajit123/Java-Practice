class HappyNumber{
    public static void main(String[] args){
        System.out.println(SumSqDigits(143));
        System.out.println(isHappyNumber(10));
    }
    public static boolean isHappyNumber(int num){
        while(num != 1 && num != 4){
            num = SumSqDigits(num);
        }
        return num == 1;
    }
    public static int  SumSqDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += (num % 10) * (num % 10);
            num /= 10;
        }
        return sum;
    }
}