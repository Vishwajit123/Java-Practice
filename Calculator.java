import java.util.Scanner;
class Calculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println( "\n-------------  Welcome to My Calculator ------------------\n");

		System.out.print("\nEnter the operand1 : ");
		double operand1 = sc.nextDouble();
		System.out.print("\nEnter the operator : ");
		char operator = sc.next().charAt(0);
		System.out.print("\nEnter the operand2 : ");
		double operand2 = sc.nextDouble();
		
		double Result = 0;
		Result =
		(operator == '+')?(operand1 + operand2):
		
		((operator == '-')?(operand1 - operand2):
		
		((operator == '*')?(operand1 * operand2):
		
		((operator == '/')?(operand1 / operand2):
		
		((operator == '%')?(operand1 % operand2):
		
		(Double.MAX_VALUE)))));
		
		System.out.println(" ");

		if(Result != Double.MAX_VALUE){
			System.out.println(operand1 + " " + operator + " " + operand2 + " = " + String.format("%.3f", Result));
		}
		else{
			System.out.println("Invalid operator");
			}

	}	
}
	
