package order;

import java.util.*;
import product.SanPham;
import payment.PhuongThucThanhToan;

public class DonHang {
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

    public void thanhToan() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Don hang trong! Khong the thanh toan.");
            return;
        }
        if (phuongThucThanhToan == null) {
            System.out.println("Chua chon phuong thuc thanh toan!");
            return;
        }

        double tongTien = tinhTongTien();
        System.out.println("\n=== THANH TOAN DON HANG ===");
        System.out.println("Khach hang: " + tenKhachHang);
        System.out.println("Danh sach san pham:");
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSanPham.get(i).toString());
        }
        System.out.printf("Tong tien: %.0f VND\n", tongTien);
        System.out.print("Ket qua: ");
        phuongThucThanhToan.thanhToan(tongTien);
        System.out.println("Cam on quy khach!");
    }

    public void hienThiChiTiet() {
        System.out.println("\n=== CHI TIET DON HANG ===");
        System.out.println("Khach hang: " + tenKhachHang);
        System.out.println("So luong san pham: " + danhSachSanPham.size());
        System.out.printf("Tong tien: %.0f VND\n", tinhTongTien());
    }
}
