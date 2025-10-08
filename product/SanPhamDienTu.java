package product;

public class SanPhamDienTu extends SanPham {
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
