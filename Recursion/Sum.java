 package Recursion;
 public class Sum {
    public static int sumPrint(int n){

        if(n==1){
            return 1;
        }

        int s1=sumPrint(n-1);
        int s2=n+s1;
        return s2;
    }

    public static void main(String[] args) {
        System.out.println(sumPrint(5));
    }
}
