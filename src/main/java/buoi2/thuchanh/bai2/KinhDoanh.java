package buoi2.thuchanh.bai2;

public class KinhDoanh extends NhanVien{
    private String ngonNgu;
    public KinhDoanh(String maNV, String hoTen, int tuoi, String diaChi, String gioiTinh, String ngonNgu){
        super(maNV, hoTen, tuoi, diaChi, gioiTinh);
        this.ngonNgu = ngonNgu;
    }
}
