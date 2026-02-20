package buoi1.thucHanh.baitap.bai1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<product> p = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            System.out.println("=====Nhap san pham thu " + (i+1) + "=====");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Description: ");
            String description = sc.nextLine();
            p.add(new product().setName(name).setPrice(price).setQuantity(quantity).setDescription(description));
        }

        System.out.println("=============Danh sach san pham==============");
        for (product pr : p){
            System.out.println("Ten San pham: " + pr.getName());
            System.out.println("Gia ban: " + pr.getPrice());
            System.out.println("So luong: " + pr.getQuantity());
            System.out.println("Mo ta: " + pr.getDescription());
            System.out.println("==================");
        }
    }
}
