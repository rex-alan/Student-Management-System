public class Fees {
    private int studentId;
    private int courseCode;
    private double feesPaid;
    private double balanceFees;
    private double totalFees;

    public Fees(int studentId, int courseCode, double amount){
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.feesPaid = amount;
        for (Course course : CourseRepo.getCourseList()) {
            if(course.getCode() == courseCode){
                this.totalFees = course.getFees();
                break;
            }
        }
        this.balanceFees = this.totalFees-amount;
    }

    public double getBalanceFees() {
        return balanceFees;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public double getFeesPaid() {
        return feesPaid;
    }
    public int getStudentId() {
        return studentId;
    }
    public double getTotalFees() {
        return totalFees;
    }
    public void setBalanceFees(double balanceFees) {
        this.balanceFees = balanceFees;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
        setBalanceFees(getTotalFees() - getFeesPaid());
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public void calculateBalance(int amount){
        for (Course course : CourseRepo.getCourseList()) {
            if(courseCode == course.getCode()){
                double courseFee = course.getFees();
                balanceFees = courseFee - amount;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Fees [studentId=" + studentId + ", courseCode=" + courseCode + ", totalFees=" + totalFees + ", feesPaid=" + feesPaid + ", balanceFees=" + balanceFees + "]";
    }
}
