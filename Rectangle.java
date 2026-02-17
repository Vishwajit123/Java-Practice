import java.util.*;

class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        double length = sc.nextDouble();

        System.out.println("Enter the width:");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Perimeter of Rectangle = " + perimeter);
        System.out.println("Area of Rectangle = " + area);
    }
}
