import java.util.*;
public class StudentService {
    static Scanner sc = new Scanner(System.in);
    public void addStudent(){
        System.out.print("Enter Name: "); String name = sc.nextLine();
        System.out.print("Enter Phone Number: "); String phno = sc.next();
        System.out.println("Enter Address"); 
        String doorMessage = "Door No: "; int doorNo = ExceptionHandling.onlyInteger(doorMessage);
        sc.nextLine();
        System.out.print("Street: "); String street = sc.nextLine();
        System.out.print("City: "); String city = sc.nextLine();
        String pincodeMessage = "Pincode: "; int pincode = ExceptionHandling.onlyInteger(pincodeMessage);
        System.out.print("Qualification: "); String qualification = sc.nextLine();
        boolean passedOut;
        while (true) {
            try {
                System.out.println("Are you a Student or Passed Out");
                System.out.println("1. Student\n2. Passed Out");
                String s = sc.nextLine().trim();
                int input = Integer.parseInt(s);
                if(input == 1){
                    passedOut = false;
                    break;
                }
                else if(input == 2){
                    passedOut = true;
                    break;
                }
                else{
                    System.out.println("Invalid Option");
                }
                
            } catch (Exception e) {
                System.out.println("Please choose 1 or 2");
            }
        }
        System.out.print("College: "); String college = sc.nextLine();
        Address address = new Address(doorNo, street, city, pincode);
        Student student = new Student(name, phno, address, qualification, passedOut, college);
        student.addStudent(student);
        System.out.println("Student "+student.getName()+" added Successfully");
    }
    public void studentDetail(){
        String idMessage = "Enter Student Id: "; int id = ExceptionHandling.onlyInteger(idMessage);
        for (Student student : StudentRepo.getStudentList()) {
            if(student.getId() == id){
                System.out.println(student);
                return;
            }
        }
        System.out.println("Invalid Student Id");
    }
    public void viewStudents(){
        System.err.println("Id\tName");
        for (Student student : StudentRepo.getStudentList()) {
            System.out.println(student.getId()+"\t"+student.getName());
        }
    }
    public void removeStudent(){
        String idMessage = "Enter Student Id: "; int id = ExceptionHandling.onlyInteger(idMessage);
        Student student = new Student();
        if(student.removeStudent(id)){
            System.out.println("Student removed");
        }
        else{
            System.out.println("Invalid Student Id");
        }
    }
}
