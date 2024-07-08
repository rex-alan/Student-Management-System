import java.time.LocalDate;
import java.util.*;
public class AttendanceService {
    static Scanner sc = new Scanner(System.in);
    public void takeAttendance(){
        System.out.print("Enter Student Id: "); int studId = sc.nextInt();
        sc.nextLine();
        LocalDate date = ExceptionHandling.dateValidation();
        System.out.print("Enter Present or Absent (P/A): "); char ch = sc.next().toLowerCase().charAt(0);
        Attendance attendance = new Attendance(studId, date, ch);
        AttendanceRepo.getAttendanceList().add(attendance);
    }
    public void viewAttendance(){
        for (Attendance attendance : AttendanceRepo.getAttendanceList()) {
            System.out.println(attendance);
        }
    }
    public void viewAttendanceByRollNo(){
        System.out.print("Enter Student Id: "); int studId = sc.nextInt();
        sc.nextLine();
        for (Attendance attendance : AttendanceRepo.getAttendanceList()) {
            if(attendance.getId() == studId){
                System.out.println(attendance);
            }
        }
    }
    public void viewAbsenteesOnDate(){
        LocalDate date = ExceptionHandling.dateValidation();
        for (Attendance attendance : AttendanceRepo.getAttendanceList()) {
            if(attendance.getDate().equals(date) && attendance.getPresent()=='a'){
                System.out.println("Absentee ID: "+ attendance.getId());
            }
        }
    }    
}
