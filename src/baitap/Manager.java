package baitap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager {
    ArrayList<Students> students = IOStudent_nhiPhan.read();
    ArrayList<ClassCG> classCGS = IOClassCG_nhiPhan.read();

    Scanner scanner = new Scanner(System.in);
    public Manager(){
        classCGS.add(new ClassCG(1,"C0722G1"));
        classCGS.add(new ClassCG(2,"C0822G1"));
        classCGS.add(new ClassCG(3,"C0922G1"));
    }

    public void inPut(){
        System.out.println("Nhap ten hoc vien: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh hoc vien: ");
        String gender = scanner.nextLine();
        int age=0;
        boolean check = false;
        while (!check || age <0 )
        try {
            System.out.println("Nhap tuoi hoc vien: ");
            age = Integer.parseInt(scanner.nextLine());
            check = true;
        }catch (NumberFormatException e){
            System.out.println("Nhap tuoi la so lon hon 0.");
        }
        System.out.println("Nhap so dien thoai: ");
        String phone = scanner.nextLine();

        Date date = null;

        while (true){
            System.out.println("Nhap ngay sinh nhat cua hoc vien: ");
            String birthday = scanner.nextLine();
            try {
                date = new SimpleDateFormat("dd/MM/yyy").parse(String.valueOf(birthday));
                break;
            }catch (ParseException e){
                System.out.println("Loi dinh dang.");
            }
        }
        for (int j = 0; j < classCGS.size(); j++) {
            System.out.println(j+1 + " : " + classCGS.get(j).getName());
        }

        int choice = 0;
        boolean checked = false;
        while (!checked || choice < 1 || choice >3){
            try {
                System.out.println("Moi ban chon lop theo thu tu: ");
                choice = Integer.parseInt(scanner.nextLine());

                checked = true;
            }catch (NumberFormatException e ){
                System.out.println("Ban da chon sai chon lai di .");
            }
        }
        ClassCG classs = classCGS.get(choice-1);
        Students students1 = new Students(name,gender, age, phone, date, classs );
        students.add(students1);
        IOStudent_nhiPhan.write(students);
    }

    public void show(){
        for (Students s : students) {
            System.out.println(s.toString());
        }
    }

    public void showClass(){
        int lop=0;
        boolean check = false;

        while (!check || lop<0){
            try {


                System.out.println("Nhap id lop: ");
                lop = Integer.parseInt(scanner.nextLine());
                check = true;

            } catch (NumberFormatException e){
                System.out.println("Nhap lai id la so nguyen lon hon 0");
            }
        }

        for (Students s : students) {
            if (lop == s.getClassCG().getId()){
                System.out.println(s);
                break;
            }
        }

    }


    public void menu(){
        int choice;
        do{
            System.out.println("\n========================");
            System.out.println("Menu lua chon chuc nang");
            System.out.println("1: Them");
            System.out.println("2: Show");
            System.out.println("3: Show theo id lop.  ");
            System.out.println("4: Thoat ");
            System.out.println("========================");
            System.out.println("Lua chon: ");
            while (true)
            try {
                choice = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Chon Lai: ");
            }
            switch (choice){
                case 1:
                    inPut();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    showClass();
                    break;
                case 4:
                    System.out.println("Cam on");
                    break;
                default:
                    System.out.println("chon lai di");
                    break;
            }
        }while (choice != 4);
    }



}
