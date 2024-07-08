import java.time.LocalDate;
public class CourseEnrolled {
    private int  courseCode;
    private LocalDate date;
    private int studentId;

    public CourseEnrolled(int courseCode, LocalDate date, int studentId){
        this.courseCode = courseCode;
        this.date = date;
        this.studentId = studentId;
    }

    public int getCourseCode() {
        return courseCode;
    }
    public LocalDate getDate() {
        return date;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "CourseEnrolled [courseCode=" + courseCode + ", date=" + date + ", studentId=" + studentId + "]";
    }
}
