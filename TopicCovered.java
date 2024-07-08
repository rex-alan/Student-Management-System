import java.time.LocalDate;

public class TopicCovered {
    private int studentId;
    private int courseCode;
    private String name;
    private boolean status;
    private LocalDate date;

    public TopicCovered(int studentId,int courseCode,String name,LocalDate date) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.name = name;
        this.status = true;
        this.date = date;
    }
    public TopicCovered(int studentId,int courseCode,String name,String date) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.name = name;
        this.status = true;
        this.date = ExceptionHandling.convertStringToDate(date);
    }

    public String getName() {
        return name;
    }
    public boolean getStatus(){
        return status;
    }
    public LocalDate getDate() {
        return date;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStauts(boolean stauts) {
        this.status = stauts;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "TopicCovered [studentId=" + studentId + ", courseCode=" + courseCode + ", name=" + name + ", stauts="+ status + ", date=" + date + "]";
    }
}
