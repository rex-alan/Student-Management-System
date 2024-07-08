import java.util.*;
public class FeesRepo {
    
    private static ArrayList<Fees> feesList = new ArrayList<>();

    public static ArrayList<Fees> getFeesList() {
        return feesList;
    }
    
    public static void setFeesList(ArrayList<Fees> feesList) {
        FeesRepo.feesList = feesList;
    }
}
