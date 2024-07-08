import java.util.Scanner;

public class FeesService {
    static Scanner sc = new Scanner(System.in);
    public void payFees(){
        System.out.print("Enter Student Id: "); int studId = sc.nextInt();sc.nextLine();
        if(Student.validStudent(studId) == false){
            System.out.println("Invalid Student ID");
            return;
        }
        System.out.print("Enter Course Code: "); int courseCode = sc.nextInt();sc.nextLine();
        if(Course.validCourse(courseCode) == false){
            System.out.println("Invalid Course code");
            return;
        }
        for (Fees fees : FeesRepo.getFeesList()) {
            if(fees.getStudentId() == studId && fees.getCourseCode() == courseCode){
                System.out.println("Total Fee: "+fees.getTotalFees());
                System.out.println("Paid: "+fees.getFeesPaid());
                System.out.println("Balance: "+fees.getBalanceFees());
                if(fees.getBalanceFees() == 0){
                    System.out.println("Payment Complete");
                    return;
                }
                while (true) {
                    System.out.print("Enter Amount: "); double balance = sc.nextDouble();
                    if(balance<=fees.getBalanceFees()){
                        fees.setFeesPaid(fees.getFeesPaid()+balance);
                        if(fees.getFeesPaid() == fees.getTotalFees()){
                            System.out.println("Fees paid completly");
                            return;
                        }
                        System.out.println("Balance to be paid: "+ fees.getBalanceFees());
                        return;
                    }
                    else{
                        System.out.println("Enter Fees less than "+ fees.getBalanceFees());
                    }
                }
            }
        }
        //New Fee
        for (CourseEnrolled courseEnrolled : CourseEnrolledRepo.getCourseEnrolledList()) {
            if(courseEnrolled.getStudentId() == studId && courseEnrolled.getCourseCode() == courseCode){
                Course.getCourseFee(courseCode);
                System.out.print("Enter Amount: "); double amount = sc.nextDouble();
                Fees fee = new Fees(studId, courseCode, amount);
                FeesRepo.getFeesList().add(fee);
                if(fee.getTotalFees() == amount){
                    System.out.println("Payment Complete");
                    return;
                }
                else{
                    System.out.println("Total fee: "+ fee.getTotalFees());
                    System.out.println("Paid Fee: "+ fee.getFeesPaid());
                    System.out.println("Balance Fee: "+ fee.getBalanceFees());
                    return;
                }
            }
        }
        System.out.println("You haven't Enrolled this course");
    }
    public void viewFeeById(){
        System.out.print("Enter Student Id: "); int id = sc.nextInt(); sc.nextLine();
        if(Student.validStudent(id) == false){
            System.out.println("Invaid Id");
            return;
        }
        for (Fees fees : FeesRepo.getFeesList()) {
            if(fees.getStudentId() == id){
                System.out.println(fees);
            }
        }
    }
    public void viewAllFee(){
        for (Fees fees : FeesRepo.getFeesList()) {
            System.out.println(fees);
        }
    }
    public void viewBalanceFee(){
        for (Fees fees : FeesRepo.getFeesList()) {
            if(fees.getBalanceFees()>0){
                System.out.println(fees);
            }
        }
    }
}
