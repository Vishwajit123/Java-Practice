import java.util.*;
class NoYears{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes " );
        long min = sc.nextLong();
       long days =  min / 1440 ;
       long year = days / 365 ;
       long rmdays = days % 365;
       System.out.println(min + " minutes approximately " + year + " years  and " + rmdays + " days " );
    }
}