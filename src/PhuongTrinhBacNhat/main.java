package PhuongTrinhBacNhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Phuong trinh bac nhat: ");
        System.out.println("Phuong trinh co dang:  'a * x + b = c', gan gia tri cho cac bien:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Gia tri bien x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print(" x = 0");
            } else {
                System.out.print("vo nghiem ");
            }
        }
    }
}

