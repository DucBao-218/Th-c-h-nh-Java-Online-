package payment;

public class TheTinDung implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.printf("Thanh toan bang the tin dung thanh cong. So tien: %.0f VND\n", soTien);
    }
}
