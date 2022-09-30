package baitap;


import java.io.Serializable;
import java.util.Date;


public class Students implements Serializable {
    private static final long serialVersionUID = 2906642554793891381L;
    private String name;
    private String gender;
    private int age;
    private String phone;
    private Date birthday;
    private ClassCG classCG;

    public Students() {
    }

    public Students(String name, String gender, int age, String phone, Date birthday, ClassCG classCG) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.birthday = birthday;
        this.classCG = classCG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ClassCG getClassCG() {
        return classCG;
    }

    public void setClassCG(ClassCG classCG) {
        this.classCG = classCG;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", classCG=" + classCG.toString() +
                '}';
    }
}
