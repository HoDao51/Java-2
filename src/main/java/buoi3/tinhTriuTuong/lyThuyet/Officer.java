package buoi3.tinhTriuTuong.lyThuyet;

public class Officer extends Employee{
    private double ngayCong;
    private double luongCoBan = 1000;
    public Officer(String name, int age, String phongBan) {
        super(name, age, phongBan);
        this.ngayCong = ngayCong;
    }

    @Override
    public void diemDanh() {
        System.out.println("Officer dang diem danh");
    }

    public double tinhLuong(){
        return 1000;
    }
}
