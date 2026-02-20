package buoi2.thuchanh.bai2;

public class VanPhong extends NhanVien{
    private String chuyenMon;
    public VanPhong(String maNV, String hoTen, int tuoi, String diaChi, String gioiTinh, String chuyenMon){
        super(maNV, hoTen, tuoi, diaChi, gioiTinh);
        this.chuyenMon = chuyenMon;
    }
}
