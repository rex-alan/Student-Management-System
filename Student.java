// import java.util.*;
public class Student {
    private static int counter = 1;
    private int id;
    private String name;
    private String phno;
    private Address address;
    private String qualificaton;
    private boolean passedOut;
    private String college;

    public Student(String name, String phno, Address address, String qualification, boolean passedOut, String college){
        this.id = counter++;
        this.name = name;
        this.phno = phno;
        this.address = address;
        this.qualificaton = qualification;
        this.passedOut = passedOut;
        this.college = college;
    }
    public Student(){}
    public int getId() {
        return id;
    }
    public Address getAddress() {
        return address;
    }
    public String getCollege() {
        return college;
    }
    public String getName() {
        return name;
    }
    public String getPhno() {
        return phno;
    }
    public String getQualificaton() {
        return qualificaton;
    }
    public boolean getPassedOut(){
        return passedOut;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassedOut(boolean passedOut) {
        this.passedOut = passedOut;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
    public void setQualificaton(String qualificaton) {
        this.qualificaton = qualificaton;
    }
    public void addStudent(Student student){
        StudentRepo.getStudentList().add(student);
    }
    public boolean removeStudent(int studId){
        for (Student student : StudentRepo.getStudentList()) {
            if(student.getId() == studId){
                StudentRepo.getStudentList().remove(student);
                return true;
            }
        }
        return false;
    }


    public static boolean validStudent(int id){
        for (Student student : StudentRepo.getStudentList()) {
            if(student.getId() == id){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Student [Id= " + id + ", name=" + name + ", phno=" + phno + ", address=" + address + ", qualificaton=" + qualificaton
                + ", passedOut=" + passedOut + ", college=" + college + "]";
    }
}