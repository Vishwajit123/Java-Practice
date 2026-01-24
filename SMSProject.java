import java.util.*;
class Student{
    int id;
    String name;
    int age;

    Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
   void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }
}
public class SMSProject{
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;

        
        do{
            System.out.println("\n--- Student Management System --- ");
            System.out.println("1. Add the Student");
            System.out.println("2. View Students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Remove Students:");
            System.out.println("5. Exit");
            System.out.print("Enter the your choice: ");

            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Enter  student ID: ");
                    int id=sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter  student Name: ");
                    String name=sc.nextLine();

                    System.out.print("Enter  student Age: ");
                    int age=sc.nextInt();
                    sc.nextLine();

                    students.add(new Student(id,name, age));

                    System.out.println("Student added Succesfully");
                    System.out.println("Total students: " + students.size()); 

                     System.out.println("Press Enter to continue...");
                     sc.nextLine();
                    
                    break;

                case 2:

                    if(students.isEmpty()){
                        System.out.println(" Students  not found");
                    }
                    else{
                        System.out.println("\nStudent List");

                        for(Student s: students){
                            s.display();
                            
                        }
                    }
                      System.out.println("Press Enter to continue...");
                        sc.nextLine();
                    break;

                    case 3:

                    System.out.print("Enter Student ID to search: ");

                    int searchId=sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    for(Student s : students){

                        if(s.id == searchId){
                            s.display();
                            found = true;
                             
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Student is not found");
                    }
                      System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    break;

                    case 4:
                    System.out.print("Enter Student ID to remove: ");

                    int removeId=sc.nextInt();
                    sc.nextLine();
                    boolean removed = false;

                    Iterator<Student> itr = students.iterator();
    while (itr.hasNext()) {
        Student s = itr.next();
        if (s.id == removeId) {
            itr.remove();
            removed = true;
            System.out.println("Student removed successfully");
            break;
            
            
        }
    }

                    if(!removed){
                        System.out.println("Student  not found");
                    }

                     System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                    case 5:

                    System.out.println("Thank you! Exiting...");

                    break;

                    default:
                        System.out.println("Invalid choice");



            }
        }
        while(choice != 5);
            sc.close();
        

    }
}