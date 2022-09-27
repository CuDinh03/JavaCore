package bt;

import java.util.Scanner;

abstract class PhuongTien implements PhuongThuc{
    private int id;
    private String HangSanXuat;
    private String NamSanXuat;
    private double GiaXe;
    private String MauXe;

    public PhuongTien() {
    }

    public PhuongTien(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe) {
        this.id = id;
        HangSanXuat = hangSanXuat;
        NamSanXuat = namSanXuat;
        GiaXe = giaXe;
        MauXe = mauXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public double getGiaXe() {
        return GiaXe;
    }

    public void setGiaXe(double giaXe) {
        GiaXe = giaXe;
    }

    public String getMauXe() {
        return MauXe;
    }

    public void setMauXe(String mauXe) {
        MauXe = mauXe;
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void nhap() {
        System.out.println("Nhap id cho phuong tien: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hang san xuat cho phuong tien: ");
        this.HangSanXuat = scanner.nextLine();
        System.out.println("Nhap nam cho phuong tien: ");
        this.NamSanXuat = scanner.nextLine();
        System.out.println("Nhap gia cho phuong tien: ");
        this.GiaXe = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap mau cho phuong tien: ");
        this.MauXe = scanner.nextLine();
    }


    @Override
    public void xuat() {
        System.out.println( "PhuongTien{" +
                "id=" + id +
                ", HangSanXuat='" + HangSanXuat + '\'' +
                ", NamSanXuat='" + NamSanXuat + '\'' +
                ", GiaXe=" + GiaXe +
                ", MauXe='" + MauXe + '\'' +
                '}');
    }
}
