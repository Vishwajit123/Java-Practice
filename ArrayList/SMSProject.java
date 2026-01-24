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
    void display(){
        System.out.println(" ID: " + id + " Name: " + name +" Age: " + age);
    }
}
public class SMSProject{
    public static void main(String[] args){
        ArrayList<Student> students=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;

        
        do{
            System.out.println("--- Student Management System --- ");
            System.out.println("1.Add the Student");
            System.out.println("2.View Students");
            System.out.println("3.Search student by ID");
            System.out.println("Exit");
            System.out.println("Enter the your choice:");

            choice=sc.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Enter thr student ID:");
                    int id=sc.nextInt();

                    System.out.println("Enter thr student Name:");
                    String name=sc.next();

                    System.out.println("Enter thr student Age:");
                    int age=sc.nextInt();

                    students.add(new Student(id,name, age));
                    break;

                case 2:

                    if(students.isEmpty()){
                        System.out.println(" Students is not found");
                    }
                    else{
                        System.out.println("Student List");

                        for(Student s: students){
                            s.display();
                        }
                    }
                    break;

                    default:
                        System.out.println("Invalid choice");



            }
        }
        while(choice!=5);
            sc.close();
        

    }
}