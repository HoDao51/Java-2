package buoi2.thuchanh.bai2;

public class IT extends NhanVien{
    private String ngonNguLapTrinh;
    private int soDuAnDangLam;
    public IT(String maNV, String hoTen, int tuoi, String diaChi, String gioiTinh, String ngonNguLapTrinh, int soDuAnDangLam){
        super(maNV, hoTen, tuoi, diaChi, gioiTinh);
        this.ngonNguLapTrinh = ngonNguLapTrinh;
        this.soDuAnDangLam = soDuAnDangLam;
    }

}
