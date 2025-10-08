package payment;

public class ViMomo implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.printf("Thanh toan bang vi MoMo thanh cong. So tien: %.0f VND\n", soTien);
    }
}
