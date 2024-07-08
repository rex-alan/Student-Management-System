public class Address {
    private int doorNo;
    private String streetName;
    private String city;
    private int pincode;

    public Address(int doorNo, String streetName, String city, int pincode) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }
    public int getDoorNo() {
        return doorNo;
    }
    public int getPincode() {
        return pincode;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", pincode=" + pincode+ "]";
    }
}
