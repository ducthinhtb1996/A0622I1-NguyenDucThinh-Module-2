package company.Luyen_tap.bai_1;

public class School {
    private String schoolName;
    private String shoolAddress;
    private int since;

    public School() {
    }

    public School(String schoolName, String shoolAddress, int since) {
        this.schoolName = schoolName;
        this.shoolAddress = shoolAddress;
        this.since = since;
    }

    public void speck(String loiNoi) {
        System.out.println("Chào mừng năm học mới");
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getShoolAddress() {
        return shoolAddress;
    }

    public void setShoolAddress(String shoolAddress) {
        this.shoolAddress = shoolAddress;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }
}
