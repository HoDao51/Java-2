/*
package buoi3.baitap.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCongTy {
    public class QuanLyNhanSu {
        List<NhanVien> dsNhanVien;
        List<KhachHang> dsKhachHang;
        public static  Scanner sc = new Scanner(System.in);
        public QuanLyNhanSu() {
            dsKhachHang = new ArrayList<>();
            dsNhanVien = new ArrayList<>();
        }

        public void themNhanVien() {
            //1. Mã nhân viên (e12345)
            String maNV;
            while(true) {
                maNV = sc.nextLine().trim();
                //Mã bắt đầu bằng chữ "e"
                if(!maNV.startsWith("e")) {
                    System.out.println("Mã phải bắt đầu là chữ 'e'. Nhập lại!");
                    continue;
                }
                String phanSo = maNV.substring(1); //lấy phần số sau chữ 'e'
                //Kiểm tra nếu phần số là rỗng hoặc không phải là các chữ số thì yêu cầu nhập lại.
                if(phanSo.isEmpty() || !phanSo.matches("\\d+")) {
                    System.out.println("Sau chữ 'e' phải là các số.");
                    continue;
                }
                break;
            }

            //2. Họ tên
            String hoTen;
            while(true) {
                hoTen = sc.nextLine().trim();
                if(hoTen.isEmpty()) {
                    System.out.println("Họ tên không được để rỗng. Nhập lại.");
                    continue;
                }
                break;
            }
            //3. Giới tính
            String gioiTinh = nhapGioiTinh();
            //4. Nhập ngày sinh
            String ngaySinh = nhapNgaySinh();
            //5. Nhập bằng cấp
            String bangCap = null;
            while(true) {
                System.out.println("Nhập bằng cấp:");
                System.out.println("1. Đại học");
                System.out.println("2. Cao đẳng");
                System.out.println("3. Trung cấp");
                String input = sc.nextLine().trim();
                switch (input) {
                    case "1": {
                        bangCap = "đại học";
                        break;
                    }
                    case "2": {
                        bangCap = "cao đẳng";
                        break;
                    }
                    case "3": {
                        bangCap = "trung cấp";
                        break;
                    }
                    case "4": {
                        System.out.println("Lựa chọn không hợp lệ.");
                        continue;
                    }
                }
                break;
            }
            NhanVien nv = new NhanVien(maNV, hoTen, gioiTinh, bangCap, ngaySinh);
            dsNhanVien.add(nv);
        }

        //Giới tính
        private String nhapGioiTinh() {
            while(true) {
                String gender = sc.nextLine().trim().toLowerCase();
                if(gender.isEmpty() || !gender.equals("nam") || !gender.equals("nữ")) {
                    System.out.println("Chọn lại giới tính (nam | nữ):");
                    continue;
                }
                return gender;
            }
        }
        //Ngày sinh
        private String nhapNgaySinh() {
            while(true) {
                String ngaySinh = sc.nextLine().trim();
                if(ngaySinh.length() != 10) {
                    System.out.println("Độ dài ngày sinh không đúng. Nhập lại.");
                    continue;
                }
                //Nếu ngày sinh không đúng định dạng dd/mm/YYYY
                if(!ngaySinh.matches("\\d{2}/\\d{2}/\\d{4}")) {
                    System.out.println("Định dạng ngày tháng không hợp lệ. Nhập lại.");
                    continue;
                }
                //Check ngày tháng đơn giản
                int ngay = Integer.parseInt(ngaySinh.substring(0,2));
                int thang = Integer.parseInt(ngaySinh.substring(3,5));
                int nam = Integer.parseInt(ngaySinh.substring(6,10));
                if(ngay < 1 || ngay > 31) {
                    System.out.println("Ngày không hợp lệ. Nhập lại.");
                    continue;
                }
                if(thang < 1 || thang > 12) {
                    System.out.println("Tháng không hợp lệ. Nhập lại.");
                    continue;
                }
                if(nam < 1) {
                    System.out.println("Năm không hợp lệ. Nhập lại.");
                    continue;
                }
                return ngaySinh;
            }
        }
    }
*/
