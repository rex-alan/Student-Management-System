import java.time.*;
public class Attendance {
    private int id;
    private LocalDate date;
    private char status;

    public Attendance(int id, LocalDate date, char status){
        this.id = id;
        this.date = date;
        this.status = status;
    }
    public Attendance(int id, String date, char status){
        this.id = id;
        this.date = ExceptionHandling.convertStringToDate(date);
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public char getPresent(){
        return status;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPresent(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance [id= " + id + ", date= " + date + ", Status= " + status + "]";
    }

    
}
