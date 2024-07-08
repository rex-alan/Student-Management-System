public class CourseService {
    
    public void viewAllCoursesWithTopics(){
        for (Course course : CourseRepo.getCourseList()) {
            System.out.println(course);
            System.out.println("---------------------");
        }
    }
    public void viewCourse(){
        int code = ExceptionHandling.onlyInteger("Enter Course Code: ");
        for (Course course : CourseRepo.getCourseList()) {
            if(course.getCode() == code){
                System.out.println(course);
                return;
            }
        }
    }
    public void viewEnrolledCourse(){
        int courseCode = ExceptionHandling.onlyInteger("Enter Course Code: ");
        for (CourseEnrolled ce : CourseEnrolledRepo.getCourseEnrolledList()) {
            if(ce.getCourseCode() == courseCode){
                System.out.println("Student ID:  "+ce.getStudentId() +"  Date: "+ ce.getDate());
            }
        }
    }
}