import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExceptionHandling {
    static Scanner sc = new Scanner(System.in);
    public static int onlyInteger(String message){
        while (true) {
            try {
                System.out.print(message);
                String input = sc.nextLine().trim();
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e) {
                System.out.println("!!! Please Enter Only Integer !!!");
            }
        }
    }
    public static LocalDate dateValidation(){
        while (true) {
            try {
                System.out.print("Enter Date(YYYY-MM-DD): "); String date = sc.next();
                LocalDate currenDate = LocalDate.parse(date);
                return currenDate;
            }
             catch (Exception e) {
                System.out.println("!!! Invalid Date Format !!!");
            }
        }
    }
    public static LocalDate convertStringToDate(String date){
        while (true) {
            try {
                LocalDate currenDate = LocalDate.parse(date);
                return currenDate;
            }
             catch (DateTimeParseException e) {
                System.out.println("!!! Invalid Date Format !!!");
            }
        }
    }
}
