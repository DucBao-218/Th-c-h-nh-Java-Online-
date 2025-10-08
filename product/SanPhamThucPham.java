package product;

public class SanPhamThucPham extends SanPham {
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
