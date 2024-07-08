import java.util.*;
public class AttendanceRepo {
    private static ArrayList<Attendance> attendanceList = new ArrayList<>();
    
    public static ArrayList<Attendance> getAttendanceList() {
        return attendanceList;
    }
    public static void setAttendanceList(ArrayList<Attendance> attendanceList) {
        AttendanceRepo.attendanceList = attendanceList;
    }
    public static void addAttendance(Attendance a1, Attendance a2, Attendance a3, Attendance a4, Attendance a5){
        AttendanceRepo.getAttendanceList().add(a1);
        AttendanceRepo.getAttendanceList().add(a2);
        AttendanceRepo.getAttendanceList().add(a3);
        AttendanceRepo.getAttendanceList().add(a4);
        AttendanceRepo.getAttendanceList().add(a5);
    }
}
