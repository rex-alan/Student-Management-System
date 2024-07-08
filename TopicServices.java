import java.time.LocalDate;
import java.util.*;
public class TopicServices {
    static Scanner sc = new Scanner(System.in);
    public void viewTopics(){
        int courseCode = ExceptionHandling.onlyInteger("Enter Course Code: ");
        if(Course.validCourse(courseCode) == false){
            System.out.println("Invalid Course code");
            return;
        }
        for(Course course:CourseRepo.getCourseList()){
            if(course.getCode() == courseCode){
                for (String topic : course.getTopics()) {
                    System.out.println(topic);
                }
            }
        }
    }
    public void viewCoveredTopics(){
        int studentId = ExceptionHandling.onlyInteger("Enter Student Id: ");
        if(Student.validStudent(studentId) == false){
            System.out.println("Invalid Student ID");
            return;
        }
        int courseCode = ExceptionHandling.onlyInteger("Enter Course Code: ");
        if(Course.validCourse(courseCode) == false){
            System.out.println("Invalid Course code");
            return;
        }
        for (TopicCovered topicCovered : TopicsCoveredRepo.getTopicCoveredList()) {
            if(topicCovered.getStudentId() == studentId && topicCovered.getCourseCode() == courseCode){
                System.out.println(topicCovered);
            }
        }
    }
    public void addCoveredTopics(){
        int studentId = ExceptionHandling.onlyInteger("Enter Student ID: ");
        if(Student.validStudent(studentId) == false){
            System.out.println("Invalid Student ID");
            return;
        }
        int courseCode = ExceptionHandling.onlyInteger("Enter Course Code: ");
        if(Course.validCourse(courseCode) == false){
            System.out.println("Invalid Course code");
            return;
        }
        System.out.print("Enter topic: "); String topic = sc.nextLine();
        if(Course.validTopic(topic, courseCode) == false){
            System.out.println("Invalid Topic");
            return;
        } 
        LocalDate date = ExceptionHandling.dateValidation();
        TopicCovered topicCovered = new TopicCovered(studentId, courseCode, topic, date);
        TopicsCoveredRepo.getTopicCoveredList().add(topicCovered);
    }
}
