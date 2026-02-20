package buoi4.baitap.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThongTinSach {
    List<Sach> dsSach;
    public static Scanner sc = new Scanner(System.in);
    public QuanLyThongTinSach() {
        dsSach = new ArrayList<>();
    }

    public void themSach() {
        //1. Mã sach (B001)
        String maSach;
        while(true) {
            System.out.print("Nhap ma sach: ");
            maSach = sc.nextLine().trim();
            //Mã bắt đầu bằng chữ "e"
            if(!maSach.startsWith("B")) {
                System.out.println("Mã phải bắt đầu là chữ 'B'. Nhập lại!");
                continue;
            }
            String phanSo = maSach.substring(1); //lấy phần số sau chữ 'b'
            //Kiểm tra nếu phần số là rỗng hoặc không phải là các chữ số thì yêu cầu nhập lại.
            if(phanSo.isEmpty() || !phanSo.matches("\\d+")) {
                System.out.println("Sau chữ 'B' phải là các số.");
                continue;
            }
            break;
        }

        //2. Ten sach
        String tenSach;
        while(true) {
            System.out.print("Nhap ten sach: ");
            tenSach = sc.nextLine().trim();
            if(tenSach.isEmpty()) {
                System.out.println("Ten sach không được để trong. Nhập lại.");
                continue;
            }
            break;
        }
        //3. Tac gia
        String tacGia;
        while(true) {
            System.out.print("Nhap ten tac gia: ");
            tacGia = sc.nextLine().trim();
            if(tacGia.isEmpty()) {
                System.out.println("Tên tac gia không được để trong. Nhập lại.");
                continue;
            }
            break;
        }
        //4. Nhập The loai
        String theLoai = null;
        while(true) {
            System.out.println("The loai:");
            System.out.println("1. Giao khoa");
            System.out.println("2. Van hoc");
            System.out.println("3. Khoa hoc");
            System.out.print("Chon The loai: ");
            String input = sc.nextLine().trim();
            switch (input) {
                case "1": {
                    theLoai = "Giao khoa";
                    break;
                }
                case "2": {
                    theLoai = "Van hoc";
                    break;
                }
                case "3": {
                    theLoai = "Khoa hoc";
                    break;
                }
                case "4": {
                    System.out.println("Lựa chọn không hợp lệ.");
                    continue;
                }
            }
            break;
        }

        //4. Nhập nam xuat ban
        String namXuatBan = nhapNamXuatBan();

        Sach s = new Sach(maSach, tenSach, tacGia, theLoai, namXuatBan);
        dsSach.add(s);
    }

    //namXuatBan (2024)
    private String nhapNamXuatBan() {
        while(true) {
            System.out.print("Nhap nam xuat ban: ");
            String namXuatBan = sc.nextLine().trim();
            if(namXuatBan.length() != 4) {
                System.out.println("Độ dài nam xuat ban không đúng. Nhập lại.");
                continue;
            }
            if(!namXuatBan.matches("\\d{4}")) {
                System.out.println("Định dạng nam không hợp lệ. Nhập lại.");
                continue;
            }
            return namXuatBan;
        }
    }
}
