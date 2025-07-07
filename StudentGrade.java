import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your RollNO: ");
        int RollNo=scanner.nextInt();

        System.out.print("Enter your DIV:");
        String Div=scanner.nextLine();
        scanner.nextLine();

         String[] subjects = {"Math", "Science", "English", "History", "Computer"};
        int[] marks=new int[5];
        int total=0;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter marks for " + subjects[i] + " (0 to 100): ");
                marks[i] = scanner.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println(" Invalid input. Please enter marks between 0 and 100.");
                }
            } while (marks[i] < 0 || marks[i] > 100);
            total += marks[i];
        }

        float Percentage=total/ 5.0f;

        String grade ;
        if(Percentage>90){
            grade="A+";
        }
         else if(Percentage>75){
            grade="A";
        }
         else if(Percentage>60){
            grade="B";
        }
         else if(Percentage>40){
            grade="C";
        }
        else{
            grade="Fail";
        }
        
        System.out.println("-----------Student Report-----------------");
        System.out.println("Student name: "+name);
        System.out.println("Total marks: "+total);
        System.out.println("percentage: "+Percentage+"%");
        System.out.println("Grade: "+ grade);
        System.out.println("--------------------------------------------");

          for (int i = 0; i < 5; i++) {
            String status = (marks[i] >= 40) ? "Pass" : "Fail";
            System.out.println(subjects[i] + ": " + marks[i] + " (" + status + ")");
        }

        System.out.println("----------------------------------");
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + Percentage + "%");
        System.out.println("Final Grade : " + grade);
        System.out.println("----------------------------------");

        scanner.close();
        
    }
    
}
