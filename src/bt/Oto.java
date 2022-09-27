package bt;

public class Oto extends PhuongTien {
    private int soChoNgoi;
    private double KieuCoDong;

    public Oto() {
    }

    public Oto(int soChoNgoi, double kieuCoDong) {
        this.soChoNgoi = soChoNgoi;
        KieuCoDong = kieuCoDong;
    }

    public Oto(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe, int soChoNgoi, double kieuCoDong) {
        super(id, hangSanXuat, namSanXuat, giaXe, mauXe);
        this.soChoNgoi = soChoNgoi;
        KieuCoDong = kieuCoDong;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public double getKieuCoDong() {
        return KieuCoDong;
    }

    public void setKieuCoDong(double kieuCoDong) {
        KieuCoDong = kieuCoDong;
    }
    @Override
    public void nhap() {
        System.out.println("Nhap thong tin oto ! ");

        super.nhap();
        System.out.println("Nhap so cho ngoi cho xe: ");
        this.soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu dong cho cho xe: ");
        this.KieuCoDong = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", KieuCoDong=" + KieuCoDong +
                '}');


    }
}
