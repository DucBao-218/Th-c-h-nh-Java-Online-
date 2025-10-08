import product.*;
import payment.*;
import order.*;

public class CuaHangTrucTuyen {

    private static PhuongThucThanhToan chonPhuongThuc(String loai) {
        switch (loai.toLowerCase()) {
            case "tienmat":
                return new TienMat();
            case "thetindung":
                return new TheTinDung();
            case "momo":
                return new ViMomo();
            default:
                throw new IllegalArgumentException("Phuong thuc khong hop le!");
        }
    }

    public static void main(String[] args) {
        QuanLySanPham ql = new QuanLySanPham();

        System.out.println("=== THEM SAN PHAM MOI ===");
        ql.themSanPham(new SanPhamDienTu("DT001", "iPhone 15", 25000000, "123456789012345", "12 thang"));
        ql.themSanPham(new SanPhamDienTu("DT002", "Samsung TV", 15000000, "987654321098765", "24 thang"));
        ql.themSanPham(new SanPhamThucPham("TP001", "Banh quy", 45000, "31/12/2024"));
        ql.themSanPham(new SanPhamThucPham("TP002", "Sua tuoi", 25000, "30/06/2024"));

        ql.hienThiTatCa();

        System.out.println("\n=== XU LY DON HANG ===");

        DonHang dh1 = new DonHang("Nguyen Van A");
        dh1.themSanPham(ql.getSanPham(0));
        dh1.themSanPham(ql.getSanPham(2));
        dh1.setPhuongThucThanhToan(chonPhuongThuc("tienmat")); 
        dh1.hienThiChiTiet();
        dh1.thanhToan();

        DonHang dh2 = new DonHang("Nguyen Van B");
        dh2.themSanPham(ql.getSanPham(1));
        dh2.themSanPham(ql.getSanPham(3));
        dh2.setPhuongThucThanhToan(chonPhuongThuc("thetindung"));
        dh2.hienThiChiTiet();
        dh2.thanhToan();

        DonHang dh3 = new DonHang("Tran Thi C");
        dh3.themDanhSachSanPham(ql.getDanhSach());
        dh3.setPhuongThucThanhToan(chonPhuongThuc("momo"));
        dh3.hienThiChiTiet();
        dh3.thanhToan();
    }
}
