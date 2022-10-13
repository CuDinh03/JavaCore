package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Controllermenu {

    Scanner scanner = new Scanner(System.in);
    File file = new File("datastudents.txt");

    IOReadAndWrite ioReadAndWrite = new IOReadAndWrite();
    ArrayList<Students> list = ioReadAndWrite.read(file);
    Controller controller = new Controller();
    public Controllermenu(){
        list.add(new Students(4,"cu","nam","hn",6.5));
        ioReadAndWrite.write(file,list);
    }

    void menuMain() {
        int choice = 0;
        while (true){
            System.out.println("\n----CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN----");
            System.out.println("Chọn chức theo số ( để tiếp tục )");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng:");

            while (choice !=0 || true) {
                System.out.println("lựa chọn của bạn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("Bạn nhập sai định dạng rồi");
                }

            }
            switch (choice) {
                case 1:
                    controller.showData();
                    break;
                case 2:
                    controller.inputData();
                    break;
                case 3:
                    controller.changeData();
                    break;
                case 4:
                    controller.deleteData();
                    break;
                case 5:
                    sortStudents();
                    break;
                case 6:
                    controller.readFile(list,file);
                    break;
                case 7:
                    controller.writeFile(list,file);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại đi bro");
                    break;
            }
        }
    }

    void sortStudents() {
        int choice = 0;
        do {
            System.out.println("\n----Sắp xếp sinh viên theo điểm trung bình----");
        System.out.println("Chọn chức theo số ( để tiếp tục )");
        System.out.println("1. Sắp xếp điểm trung bình tăng dần");
        System.out.println("2. Sắp xếp điểm trung bình giảm dần");
        System.out.println("3. Thoát");
        System.out.println("Chọn chức năng:");

            while (choice < 0 || true) {
                System.out.println("lựa chọn của bạn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("Bạn nhập sai định dạng rồi");
                }

            }
            switch (choice) {
                case 1:
                    controller.sortMintoMax();
                    controller.showData();
                    break;
                case 2:
                    controller.sortMaxtoMin();
                    break;

                case 3:

                    break;
                default:
                    System.out.println("Nhập lại đi bro");
                    break;
            }
        } while (choice != 3);
    }
}
