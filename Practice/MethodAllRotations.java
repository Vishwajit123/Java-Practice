class MetodAllRotations{
    public static void main(String [] args){
        System.out.println(rotate(1234));
        // allRotations(1234);
        // nRotations(1234 , 4);
        System.out.println(leftRotations(1234));
    }
    public static int leftRotations(int num){
        int fd = num/ power(num/10);
        num = num% power(num/10);
        return num * 10 + fd;
    }
    public static void nRotations(int num , int n){
        int rot=num;
        for(int i = 0; i < n; i++){
            rot = rotate(rot);
            System.out.println(rot);

        }
    }
    public static void allRotations(int num){
        int rot = num;
       do{
            System.out.println(rot);
            rot = rotate(rot);
        } while(rot != num);
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