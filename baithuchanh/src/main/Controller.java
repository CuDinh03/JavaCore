package main;

import java.io.File;
import java.util.*;

public class Controller {
    ArrayList<Students> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    void inputData(){

        int id = 0;
        int i=0;
        while (i<list.size()){
            if (id == list.get(i).getId()){
                id = list.get(i).getId()+1;
            }
            i++;
        }
        System.out.println("Nhập tên học viên");
        String name = scanner.nextLine();
        String gender;
        do{
            System.out.println("Nhập giới tính: nam / nữ");
            gender = scanner.nextLine();
            break;
        } while (!gender.equals("nam")||gender.equals("nũ"));
        System.out.println("Nhập địa chỉ của sinh viên:");
        String address = scanner.nextLine();
        double avg=0;
        while (avg<0||true){
            System.out.println("Nhập điểm trung bình: ");
            try{
                avg = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        Students student1 = new Students(id,name,gender,address,avg);
        list.add(student1);
    }

    void showData(){
        for (Students s:list) {
            System.out.println(s.toString());
        }
    }
    void changeData(){

        int id=0;
        while (id<0|| true){
            System.out.println("Nhập id sinh viên cần sửa");
            try{
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id){
                System.out.println("Nhập lại tên: ");
                list.get(i).setName(scanner.nextLine());
                System.out.println("Nhập lại giới tính: ");
                list.get(i).setGender(scanner.nextLine());
                System.out.println("Nhập lại địa chỉ: ");
                list.get(i).setAddress(scanner.nextLine());
                System.out.println("Nhập lại điểm: ");
                list.get(i).setAvg(Double.parseDouble(scanner.nextLine()));
                System.out.println("Sửa thành công.");
                break;
            }
        }
    }
    void deleteData(){
        int id =0;
        int check =0;
        while(id<0||true){
            System.out.println("Nhập id cần xoá: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()){
                    if (checked()){
                        list.remove(i);
                        check = 1;
                        break;
                    }
                    check = 2;
                    break;
                }
                check =0;
        }

        if (check==1) {
            System.out.println("Đã xoá thành công!");
            System.out.println("Danh sách sau xoá");
            showData();
        } else if (check==2) {
            System.out.println("Không xoá thành công xin thử lại.");
            showData();
    }else {
            System.out.println("Không tìm thấy để xoá! ");
            showData();
        }
    }

    private boolean checked(){
        System.out.println("Bạn chắc chắn muốn xoá chưa ? N/Y");
        if (scanner.nextLine().equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    void sortMintoMax(){
        Comparator<Students> com1 = (o1, o2) -> {
            if (o1.getAvg() < o2.getAvg()) {
                return -1;
            }else if (o1.getAvg() == o2.getAvg()){
                return 0;
            }else {
                return 1;
            }

        };
        Collections.sort(list,com1);
    }

    void sortMaxtoMin(){
        sortMaxtoMin();
        Collections.reverse(list);
        showData();
    }

    void readFile(ArrayList<Students> list, File file){
        file = new File("datastudents.csv");
        IOReadAndWrite ioReadAndWrite = new IOReadAndWrite();

        ArrayList<Students> list1 = ioReadAndWrite.read(file);

        System.out.println("Ghi thành công");

        System.out.println(list1.toString());
    }
    void writeFile(ArrayList<Students> list, File file){
        file = new File("datastudents.csv");
        IOReadAndWrite ioReadAndWrite = new IOReadAndWrite();
        Students students = new Students(0,"cu","nam","py",4.5);
        list.add(students);
        ioReadAndWrite.write(file,list);

    }
}
