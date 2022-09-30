package company.Luyen_tap.bai_1;

public class SoNganHang {
    private String passbookNumber;
    private String passbookOwner;
    private String dateOfExpiry;
    private int AuthenCode;

    public SoNganHang() {};
// Khởi tạo contructor
    public SoNganHang(String passbookNumber, String passbookOwner, String dateOfExpiry, int authenCode) {
        this.passbookNumber = passbookNumber;
        this.passbookOwner = passbookOwner;
        this.dateOfExpiry = dateOfExpiry;
        AuthenCode = authenCode;
    }

    // Khởi tạo thương thức set và get


    public String getPassbookNumber() {
        return passbookNumber;
    }

    public void setPassbookNumber(String passbookNumber) {
        this.passbookNumber = passbookNumber;
    }

    public String getPassbookOwner() {
        return passbookOwner;
    }

    public void setPassbookOwner(String passbookOwner) {
        this.passbookOwner = passbookOwner;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public int getAuthenCode() {
        return AuthenCode;
    }

    public void setAuthenCode(int authenCode) {
        AuthenCode = authenCode;
    }
}
