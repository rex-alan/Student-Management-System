import java.util.*;
public class StudentRepo {
    private static ArrayList<Student> studentList = new ArrayList<>();
    
    public static ArrayList<Student> getStudentList() {
        return studentList;
    }
    public static void setStudentList(ArrayList<Student> studentList) {
        StudentRepo.studentList = studentList;
    }

    public static void viewStudents(){
        for (Student student : studentList) {
            System.out.println(student);
            System.out.println("------------------------------------");
        }
    }
}
