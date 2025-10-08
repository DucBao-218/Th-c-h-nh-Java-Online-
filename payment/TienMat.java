package payment;

public class TienMat implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.printf("Thanh toan tien mat thanh cong. So tien: %.0f VND\n", soTien);
    }
}
