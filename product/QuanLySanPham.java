package product;

import java.util.*;

public class QuanLySanPham {
    private List<SanPham> danhSach;

    public QuanLySanPham() {
        this.danhSach = new ArrayList<>();
    }

    public void themSanPham(SanPham sp) {
        danhSach.add(sp);
        System.out.println("Da them san pham: " + sp.toString());
    }

    public void hienThiTatCa() {
        System.out.println("\n=== DANH SACH SAN PHAM ===");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSach.get(i).toString());
        }
    }

    public List<SanPham> getDanhSach() {
        return new ArrayList<>(danhSach);
    }

    public SanPham getSanPham(int index) {
        if (index >= 0 && index < danhSach.size()) {
            return danhSach.get(index);
        }
        return null;
    }
}
