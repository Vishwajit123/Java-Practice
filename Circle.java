import java.util.*;
class Circle{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double r = sc.nextFloat();

        double perimeter = 2 * Math.PI * r ;
        double area = Math.PI * r * r ;

        System.out.println("The Perimeter is " + perimeter + " and  Area is " + area + " of the circle " );

    }
}