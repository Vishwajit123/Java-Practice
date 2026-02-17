class LeapYear{
	public static void main (String[] args){
		System.out.print("Enter a Year : ");
		int year = new java.util.Scanner(System.in).nextInt();

		String output = 
		(year % 4 == 0 && year % 100  != 0 || year  % 400 == 0)?
		(year+ " is a leap Year"):
		(year+" is not a Leap Year");

		System.out.println(output);
	}
}