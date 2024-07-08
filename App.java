import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        //LOADING COURSES
        Loaders loaders = new Loaders();
        loaders.loadCourse();
        loaders.loadStudents();
        loaders.loadCourseEnrolled();
        loaders.LoadAttendance();
        loaders.loadCoveredTopics();
        loaders.loadFee();

        boolean flag = true;
        while (flag) {
            int input = ExceptionHandling.onlyInteger("1.Students\n2.Courses\n3.Attendance\n4.Fees\n5.Exit\n");
            switch(input){
                case 1:
                    student();
                    break;
                case 2:
                    course();
                    break;
                case 3:
                    attendance();
                    break;
                case 4:
                    fees();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    public static void student(){
        StudentService ss = new StudentService();
        boolean flag = true;
        while (flag) {
            int input = ExceptionHandling.onlyInteger("1.Add Student\n2.View Student with Detail\n3.View All Students \n4.Remove Student\n9.Exit\n");
            switch (input) {
                case 1:
                    ss.addStudent();
                    break;
                case 2:
                    ss.studentDetail();
                    break;
                case 3:
                    ss.viewStudents();
                    break;
                case 4:
                    ss.removeStudent();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
    public static void course(){
        CourseService cs = new CourseService();
        TopicServices ts = new TopicServices();
        boolean flag = true;
        while (flag) {
            int input = ExceptionHandling.onlyInteger("1.View Course\n2.View All Course With Topic\n3.View Enrolled Courses\n4.View Topics\n5.Add Covered topics\n6.View Covered Topics.\n9.Exit\n");
            switch(input){
                case 1:
                    cs.viewCourse();
                    break;
                case 2:
                    cs.viewAllCoursesWithTopics();
                    break;
                case 3:
                    cs.viewEnrolledCourse();
                    break;
                case 4:
                    ts.viewTopics();
                    break;
                case 5:
                    ts.addCoveredTopics();
                    break;
                case 6:
                    ts.viewCoveredTopics();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
    public static void attendance(){
        AttendanceService as = new AttendanceService();
        boolean flag = true;
        while (flag) {
            System.out.println("1.Take Attendance\n2.View Attendance\n3.View Attendance by Roll No\n4.View Absentees on Particular Date\n9.Exit");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    as.takeAttendance();
                    break;
                case 2:
                    as.viewAttendance();
                    break;
                case 3:
                    as.viewAttendanceByRollNo();
                    break;
                case 4:
                    as.viewAbsenteesOnDate();
                    break;
                
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
    public static void fees(){
        FeesService fs = new FeesService();
        boolean flag = true;
        while (flag) {
            System.out.println("1.Pay Fee\n2.View Fee Details\n3.View Total Fee List\n4.View Balance Fee List\n9.Exit");
            int input = sc.nextInt();sc.nextLine();
            switch (input) {
                case 1:
                    fs.payFees();
                    break;
                case 2:
                    fs.viewFeeById();
                    break;
                case 3:
                    fs.viewAllFee();
                    break;
                case 4:
                    fs.viewBalanceFee();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
