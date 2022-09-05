package ChuyenDoiSoSangChu;

import java.util.Scanner;

public class Main {

    public static String hangTram(int soHt) {
        String ht = "";
        if (soHt == 0) {

        } else {
            switch (soHt) {
                case 1:
                    ht = "one hundred";
                    break;
                case 2:
                    ht = "two hundred";
                    break;
                case 3:
                    ht = "three hundred";
                    break;
                case 4:
                    ht = "four hundred";
                    break;
                case 5:
                    ht = "five hundred";
                    break;
                case 6:
                    ht = "six hundred";
                    break;
                case 7:
                    ht = "seven hundred";
                    break;
                case 8:
                    ht = "eight hundred";
                    break;
                case 9:
                    ht = "nine hundred";
                    break;
                default:
                    break;
            }
        }
        return ht;
    }

    public static String hangChuc(int soHc, int soHdv) {
        String hc = "";
        if (soHc == 0) {

        } else if (soHc == 1) {
            switch (soHdv) {
                case 0:
                    hc = "ten";
                    break;
                case 1:
                    hc = "eleven";
                    break;
                case 2:
                    hc = "twelve";
                    break;
                case 3:
                    hc = "thirteen";
                    break;
                case 4:
                    hc = "fourteen";
                    break;
                case 5:
                    hc = "fifteen";
                    break;
                case 6:
                    hc = "sixteen";
                    break;
                case 7:
                    hc = "seventeen";
                    break;
                case 8:
                    hc = "eighteen";
                    break;
                case 9:
                    hc = "nineteen";
                    break;
                default:
                    break;
            }
            return hc;
        } else {
            switch (soHc) {
                case 2:
                    hc = "twenty";
                    break;
                case 3:
                    hc = "thirty";
                    break;
                case 4:
                    hc = "forty";
                    break;
                case 5:
                    hc = "fifty";
                    break;
                case 6:
                    hc = "sixty";
                    break;
                case 7:
                    hc = "seventy";
                    break;
                case 8:
                    hc = "eighty";
                    break;
                case 9:
                    hc = "ninety";
                    break;
                default:
                    break;
            }
        }
        return hc;
    }

    public static String hangDonVi(int soHdv) {
        String hdv = "";

        switch (soHdv) {
            case 1:
                hdv = "one";
                break;
            case 2:
                hdv = "two";
                break;
            case 3:
                hdv = "three";
                break;
            case 4:
                hdv = "four";
                break;
            case 5:
                hdv = "five";
                break;
            case 6:
                hdv = "six";
                break;
            case 7:
                hdv = "seven";
                break;
            case 8:
                hdv = "eight";
                break;
            case 9:
                hdv = "nine";
                break;
            default:
                break;

        }
        return hdv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen khong qua 3 chu so: ");
        System.out.println("So hang tram: ");
        int soHt = scanner.nextInt();
        scanner.nextLine();

        System.out.println("So hang chuc: ");
        int soHc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("So hang don vi: ");
        int soHdv = scanner.nextInt();
        scanner.nextLine();

        outPut(soHt, soHc, soHdv);
    }

    public static void outPut(int soHt, int soHc, int soHdv) {
        if (soHt == 0 && soHc > 1) {
            System.out.println("So do la: " + hangChuc(soHc, soHdv) + "-" + hangDonVi(soHdv));
        } else if (soHt == 0 && soHc == 1) {
            System.out.println("So do la: " + hangChuc(soHc, soHdv));
        } else {
            System.out.println("So do la: " + hangTram(soHt) + " and " + hangChuc(soHc, soHdv) + hangDonVi(soHdv));
        }
    }
}

