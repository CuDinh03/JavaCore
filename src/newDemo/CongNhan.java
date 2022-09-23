package newDemo;

public class CongNhan extends CanBo {
    private String Bac;

    public CongNhan() {
    }

    public CongNhan(String bac) {
        Bac = bac;
    }

    public CongNhan(String name, String date, String gender, String address, String bac) {
        super(name, date, gender, address);
        Bac = bac;
    }

    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "Bac='" + Bac + '\'' +
                '}';
    }
}
