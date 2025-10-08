package product;

public abstract class SanPham {
    protected String ma;
    protected String ten;
    protected double gia;
    
    public SanPham(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    @Override
    public abstract String toString();
}
