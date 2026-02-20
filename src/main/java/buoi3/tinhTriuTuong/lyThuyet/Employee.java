package buoi3.tinhTriuTuong.lyThuyet;
/**
    Duoc coi la khuon mau cua cac class ke thua
    Abstract class duoc khai bao bang tu khoa Abstract
    khong khoi tao doi tuong duoc tu Abstract class
    Trong Abstract class co the co thuoc tinh, phuong thuc thuong, phuong thuc truu tuong
 **/
public abstract class Employee {
    private String name;
    private int age;
    private String phongBan;

    public Employee(String name, int age, String phongBan) {
        this.name = name;
        this.age = age;
        this.phongBan = phongBan;
    }

    public abstract void diemDanh();

    /**
     * Abstract method:
     * la phuong thuc khong co than ham
     * cac lop ke thua lop abstract phai Override lai phuong thuc Abstract
     **/
}
