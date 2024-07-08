import java.util.*;
public class CourseRepo {
    private static ArrayList<Course> courseList = new ArrayList<>();

    public static ArrayList<Course> getCourseList() {
        return courseList;
    }
    public static void setCourseList(ArrayList<Course> courseList) {
        CourseRepo.courseList = courseList;
    }

    public static void viewCourses(){
        for (Course course : courseList) {
            System.out.println(course);
        }
    }  
}
