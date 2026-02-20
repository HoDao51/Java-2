package buoi3.baitap.bai1;

public class KhachHang extends ThongTin{
    private String maKH;
    private String loaiKH;
    public KhachHang(String hoTen, String gioiTinh, String ngaySinh) {
        super(hoTen, gioiTinh, ngaySinh);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                ", loaiKH='" + loaiKH + '\'' +
                '}';
    }
}
