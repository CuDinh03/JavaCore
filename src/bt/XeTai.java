package bt;

public class XeTai extends PhuongTien {
    private double TrongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        TrongTai = trongTai;
    }

    public XeTai(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe, double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaXe, mauXe);
        TrongTai = trongTai;
    }

    public double getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(double trongTai) {
        TrongTai = trongTai;
    }
    @Override
    public void nhap() {
        System.out.println("Nhap thong tin xe tai ! ");
        super.nhap();
        System.out.println("Nhap thong tin trong tai: ");
        this.TrongTai = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("XeTai{" +
                "TrongTai=" + TrongTai +
                '}');

    }
}
