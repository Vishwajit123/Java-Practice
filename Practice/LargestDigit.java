class LargestDigit{
    public static void main(String[] args){
        System.out.println(largestDigitNum(3783526));
    }
    public static int largestDigitNum(int num){
        int max = 0;
        while(num != 0){
            int ld = num % 10;
            if(ld > min){
                max = ld;
            }
            num/=10;
        }
        return max;
    }
}