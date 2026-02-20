package buoi4.baitap.bai1;

public class DocGia {
    private String maDocGia;
    private String tenDocGia;
    private String soDienThoai;
    private String loaiThe;
    private String ngayDangKy;

    public DocGia(String maDocGia, String tenDocGia, String soDienThoai, String loaiThe, String ngayDangKy) {
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.soDienThoai = soDienThoai;
        this.loaiThe = loaiThe;
        this.ngayDangKy = ngayDangKy;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    @Override
    public String toString() {
        return "DocGia{" +
                "maDocGia='" + maDocGia + '\'' +
                ", tenDocGia='" + tenDocGia + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", loaiThe='" + loaiThe + '\'' +
                ", ngayDangKy='" + ngayDangKy + '\'' +
                '}';
    }
}
