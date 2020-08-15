
public class AccountHolder {

    private String name;
    private String icNumber;
    private String address;
    private String phoneNumber;

    public AccountHolder(String name, String icNumber, String address, String phoneNumber) {
        this.name = name;
        this.icNumber = icNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
