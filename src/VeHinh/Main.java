package VeHinh;

import java.util.Scanner;

public class Main {
    public static void hinhChuNhat(){
        for (int i=0;i<3;i++){
            System.out.println();
            for (int j =0;j<7;j++){
                System.out.print("*");
            }
        }
    }
    public static void hinhTamGiac2(){
        for (int i=1;i<=5;i++){
            System.out.println();
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
        }
    }
    public static void hinhTamGiac3(){
        for (int i=6;i>=1;i--){
            System.out.println();
            for (int j =1;j<i;j++){
                System.out.print("*");
            }
        }
    }
    public static void tamGiacDeu(){
        int i, j;
        int n =6;
        for(i = 1; i <= n; i++) {
            for(j = 1; j < i; j++)
                System.out.print(" ");

            for(j = i; j <= n; j++)
                System.out.print("* ");

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=====================================");
            System.out.println("1: hinh chu nhat");
            System.out.println("2: hinh tam giac vuong goc trai duoi ");
            System.out.println("3: hinh tam giac vuong goc trai tren ");
            System.out.println("4: tam giac deu ");
            System.out.println("0: thoat");
            System.out.println("=====================================");
            System.out.println("Lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    hinhTamGiac2();
                    break;
                case 3:
                    hinhTamGiac3();
                    break;
                case 4:
                    tamGiacDeu();
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Lua chon lai di ngu the ?");
                    break;
            }
        }while (choice!=0);
    }
}
