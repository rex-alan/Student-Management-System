import java.util.*;
public class CourseEnrolledRepo {
    private static ArrayList<CourseEnrolled> courseEnrolledList = new ArrayList<>();

    public static ArrayList<CourseEnrolled> getCourseEnrolledList() {
        return courseEnrolledList;
    }

    public static void setCourseEnrolledList(ArrayList<CourseEnrolled> courseEnrolledList) {
        CourseEnrolledRepo.courseEnrolledList = courseEnrolledList;
    }
}
