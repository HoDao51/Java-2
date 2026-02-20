package buoi4.baitap.bai1;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1.Them sach");
        System.out.println("2.Them doc gia");
        System.out.println("3.Hien thi danh sach Sach");
        System.out.println("4.Hien thi danh sach Doc Gia");
        System.out.println("0.thoát chương trình");
    }
    public static void main(String[] args) {
        QuanLyThongTinSach qls = new QuanLyThongTinSach();
        int choice;
        boolean isContinue = true;
        do{
            showMenu();
            System.out.print("Chọn hành động: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice >= 1 && choice <= 5) {
                switch (choice) {
                    case 1: {
                        System.out.println("========== Nhap thong tin Sach ==========");
                        qls.themSach();
                        break;
                    }
                    case 2: {

                        break;
                    }
                    case 3: {

                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        break;
                    }
                    case 0:
                        isContinue = false;
                        System.out.println("Ban da dung chuong chinh.");
                }
            }else{
                System.out.println("lựa chọn không hợp lệ");
            }
        }while(isContinue);
        System.out.println("thoát chương trình!");
    }
}
