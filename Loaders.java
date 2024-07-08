import java.time.LocalDate;
import java.util.ArrayList;

public class Loaders {
    public void loadCourse(){
        //Topics for "BASIC PROGRAMMING-C01"
        String c011 = new String("1. Fundamentals of Programming");
        String c012 = new String("2. Conditional Statement");
        String c013 = new String("3. Loops");
        String c014 = new String("4. Collections");
        ArrayList<String> basicProgrammingTopics = new ArrayList<>();
        basicProgrammingTopics.add(c011);
        basicProgrammingTopics.add(c012);
        basicProgrammingTopics.add(c013);
        basicProgrammingTopics.add(c014);

        //Topocs for "OBJECT ORIENTED PROGRAMMING-C02"
        String c021 = new String("1. Inheritance");
        String c022 = new String("2. Polymorphism");
        String c023 = new String("3. Encapsulation & Abstraction");
        String c024 = new String("4. Mini Project");
        ArrayList<String> ooProgrammingTopics = new ArrayList<>();
        ooProgrammingTopics.add(c021);
        ooProgrammingTopics.add(c022);
        ooProgrammingTopics.add(c023);
        ooProgrammingTopics.add(c024);

        //Topics for "SQL-C03"
        String c031 = new String("1. Normal Forms");
        String c032 = new String("2. DDL Statements");
        String c033 = new String("3. DML Statements");
        String c034 = new String("4. Stored Procedures");
        String c035 = new String("5. Triggers");
        ArrayList<String> sqlTopics = new ArrayList<>();
        sqlTopics.add(c031);
        sqlTopics.add(c032);
        sqlTopics.add(c033);
        sqlTopics.add(c034);
        sqlTopics.add(c035);

        Course c01 = new Course(101, "Basic Programming and Problem Solving",basicProgrammingTopics , 10000);
        Course c02 = new Course(102,"Object Oriented Programming",ooProgrammingTopics, 8000);
        Course c03 = new Course(103, "SQL", sqlTopics, 5000);

        c01.addCourse(c01);
        c02.addCourse(c02);
        c03.addCourse(c03);
    }
    public void loadStudents(){
        Address a1 = new Address(57, "Mariyam Nagar", "Trichy", 620001);
        Address a2 = new Address(5, "VOC Nagar", "Chennai", 620028);
        Address a3 = new Address(24, "Vadapalani", "Banglore", 350001);
        Address a4 = new Address(87, "Ukkadam", "Coimbatore", 250001);

        Student s1 = new Student("Rex Alan J", "9025474586", a1, "M.Sc Data Science", true, "St.Joseph College");
        Student s2 = new Student("Stalin J.P", "6985475215", a2, "B.Sc Mathematics", true, "Loyola College");
        Student s3 = new Student("Starjan", "9900456585", a3, "B.E Computer Science", false, "Christ University");
        Student s4 = new Student("Deepak", "9568740888", a4, "B.Tech Mechanical", true, "Sri Krishna");

        s1.addStudent(s1);
        s2.addStudent(s2);
        s3.addStudent(s3);
        s4.addStudent(s4);
    }

    public void loadCourseEnrolled(){
        //Course Enrolled
        CourseEnrolled ce1 = new CourseEnrolled(101, LocalDate.parse("2024-05-01"), 1);
        CourseEnrolled ce2 = new CourseEnrolled(102, LocalDate.parse("2024-05-01"), 1);
        CourseEnrolled ce3 = new CourseEnrolled(103, LocalDate.parse("2024-06-01"), 2);
        CourseEnrolled ce4 = new CourseEnrolled(103, LocalDate.parse("2024-06-01"), 3);
        CourseEnrolled ce5 = new CourseEnrolled(102, LocalDate.parse("2024-07-10"), 4);

        CourseEnrolledRepo.getCourseEnrolledList().add(ce1);
        CourseEnrolledRepo.getCourseEnrolledList().add(ce2);
        CourseEnrolledRepo.getCourseEnrolledList().add(ce3);
        CourseEnrolledRepo.getCourseEnrolledList().add(ce4);
        CourseEnrolledRepo.getCourseEnrolledList().add(ce5);
    }
    public void LoadAttendance(){
        Attendance a1 = new Attendance(1, "2024-05-01", 'p');
        Attendance a2 = new Attendance(1, "2024-05-02", 'p');
        Attendance a3 = new Attendance(1, "2024-05-03", 'p');
        Attendance a4 = new Attendance(1, "2024-05-04", 'a');
        Attendance a5 = new Attendance(1, "2024-05-05", 'a');

        Attendance b1 = new Attendance(2, "2024-06-01", 'p');
        Attendance b2 = new Attendance(2, "2024-06-02", 'p');
        Attendance b3 = new Attendance(2, "2024-06-03", 'a');
        Attendance b4 = new Attendance(2, "2024-06-04", 'p');
        Attendance b5 = new Attendance(2, "2024-06-05", 'p');

        Attendance c1 = new Attendance(3, "2024-06-01", 'a');
        Attendance c2 = new Attendance(3, "2024-06-02", 'a');
        Attendance c3 = new Attendance(3, "2024-06-03", 'a');
        Attendance c4 = new Attendance(3, "2024-06-04", 'a');
        Attendance c5 = new Attendance(3, "2024-06-05", 'a');

        Attendance d1 = new Attendance(4, "2024-07-10", 'p');
        Attendance d2 = new Attendance(4, "2024-07-11", 'p');
        Attendance d3 = new Attendance(4, "2024-07-12", 'p');
        Attendance d4 = new Attendance(4, "2024-07-13", 'p');
        Attendance d5 = new Attendance(4, "2024-07-14", 'p');

        AttendanceRepo.addAttendance(a1, a2, a3, a4, a5);
        AttendanceRepo.addAttendance(b1, b2, b3, b4, b5);
        AttendanceRepo.addAttendance(c1, c2, c3, c4, c5);
        AttendanceRepo.addAttendance(d1, d2, d3, d4, d5);
    }
    public void loadCoveredTopics(){
        TopicCovered tc1 = new TopicCovered(1, 101, "1. Fundamentals of programming", "2024-05-10");
        TopicCovered tc2 = new TopicCovered(1, 101, "2. Conditional Statement", "2024-05-20");
        TopicCovered tc3 = new TopicCovered(2, 103, "1. Normal Forms", "2024-06-05");
        TopicCovered tc4 = new TopicCovered(4, 102,"1. Inheritance", "2024-07-12");
        TopicCovered tc5 = new TopicCovered(4, 102,"2. polyMorPhiSm", "2024-07-15");

        TopicsCoveredRepo.getTopicCoveredList().add(tc1);
        TopicsCoveredRepo.getTopicCoveredList().add(tc2);
        TopicsCoveredRepo.getTopicCoveredList().add(tc3);
        TopicsCoveredRepo.getTopicCoveredList().add(tc4);
        TopicsCoveredRepo.getTopicCoveredList().add(tc5);
    }
    public void loadFee(){
        Fees f1 = new Fees(1, 101, 4000);
        Fees f2 = new Fees(2, 103, 5000);
        Fees f3 = new Fees(4, 102, 3500);
        FeesRepo.getFeesList().add(f1);
        FeesRepo.getFeesList().add(f2);
        FeesRepo.getFeesList().add(f3);
    }
}
