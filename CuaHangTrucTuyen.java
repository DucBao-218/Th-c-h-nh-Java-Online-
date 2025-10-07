import java.util.*;

interface PhuongThucThanhToan {
    void thanhToan(double soTien);
}

class TienMat implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.printf("Thanh toan tien mat thanh cong. So tien: %.0f VND\n", soTien);
    }
}

class TheTinDung implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.printf("Thanh toan bang the tin dung thanh cong. So tien: %.0f VND\n", soTien);
    }
}

class ViMomo implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.printf("Thanh toan bang vi MoMo thanh cong. So tien: %.0f VND\n", soTien);
    }
}

abstract class SanPham {
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

class SanPhamDienTu extends SanPham {
    private String imei;
    private String baoHanh;
    
    public SanPhamDienTu(String ma, String ten, double gia, String imei, String baoHanh) {
        super(ma, ten, gia);
        this.imei = imei;
        this.baoHanh = baoHanh;
    }
    
    @Override
    public String toString() {
        return String.format("San pham dien tu - Ma: %s, Ten: %s, Gia: %.0f VND, IMEI: %s, Bao hanh: %s", 
                           ma, ten, gia, imei, baoHanh);
    }
}

class SanPhamThucPham extends SanPham {
    private String hanSuDung;
    
    public SanPhamThucPham(String ma, String ten, double gia, String hanSuDung) {
        super(ma, ten, gia);
        this.hanSuDung = hanSuDung;
    }
    
    @Override
    public String toString() {
        return String.format("San pham thuc pham - Ma: %s, Ten: %s, Gia: %.0f VND, Han su dung: %s", 
                           ma, ten, gia, hanSuDung);
    }
}

class DonHang {
    private String tenKhachHang;
    private List<SanPham> danhSachSanPham;
    private PhuongThucThanhToan phuongThucThanhToan;
    
    public DonHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
        this.danhSachSanPham = new ArrayList<>();
    }
    
    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
    }
    
    public void themDanhSachSanPham(List<SanPham> ds) {
        danhSachSanPham.addAll(ds);
    }
    
    public void setPhuongThucThanhToan(PhuongThucThanhToan pt) {
        this.phuongThucThanhToan = pt;
    }
    
    public double tinhTongTien() {
        double tong = 0;
        for (SanPham sp : danhSachSanPham) {
            tong += sp.getGia();
        }
        return tong;
    }
    
    public void hienThiChiTiet() {
        System.out.println("\n=== CHI TIET DON HANG ===");
        System.out.println("Khach hang: " + tenKhachHang);
        System.out.println("So luong san pham: " + danhSachSanPham.size());
        System.out.printf("Tong tien: %.0f VND\n", tinhTongTien());
    }
}
