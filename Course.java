import java.util.*;
public class Course {
    private int code;
    private String name;
    public ArrayList<String> topics = new ArrayList<>();
    private double fees;

    public Course(int code, String name, ArrayList<String> topics, double fees){
        this.code = code;
        this.name = name;
        this.topics = topics;
        this.fees = fees;
    }

    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public ArrayList<String> getTopics() {
        return topics;
    }
    public double getFees() {
        return fees;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }
    public void setFees(double fees) {
        this.fees = fees;
    }

    public void addCourse(Course course){
        CourseRepo.getCourseList().add(course);
    }
    public boolean removeCourse(int courseCode){
        for (Course course : CourseRepo.getCourseList()) {
            if(course.getCode() == courseCode){
                CourseRepo.getCourseList().remove(course);
                return true;
            }
        }
        return false;
    }
    public static void getCourseFee(int courseCode){
        for(Course course : CourseRepo.getCourseList()){
            if(course.getCode() == courseCode){
               System.out.println("Course Amount: "+ course.getFees());
               return;
            }
        }
        System.out.println("Invalid CourseCode");
    }

    public static boolean validCourse(int code){
        for (Course course : CourseRepo.getCourseList()) {
            if(course.getCode() == code){
                return true;
            }
        }
        return false;
    }
    public static boolean validTopic(String topic, int courseCode){
        for (Course course : CourseRepo.getCourseList()) {
            if(course.getCode() == courseCode){
                for (String top : course.getTopics()) {
                    if(top.toLowerCase().equals(topic.toLowerCase())){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String s =  "Course [code=" + code + ", name=" + name + ", fees= "+ fees +"]\n";
        for (String topic : topics) {
            s+=topic+"\n";
        }
        return s;
    }    
}
