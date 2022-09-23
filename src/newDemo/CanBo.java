package newDemo;

public class CanBo {
    private String name;
    private String date;
    private String gender;
    private String address;

    public CanBo() {

    }

    public CanBo(String name, String date, String gender, String address) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
