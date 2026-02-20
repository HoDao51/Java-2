package buoi3.tinhDaHinh.lyThuyet;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new VCB();
        Bank b2 = new ARG();
        Bank b3 = new CTG();
        Bank[] banks = new Bank[3];
        banks[0] = b1;
        banks[1] = b2;
        banks[2] = b3;
        for (Bank b : banks){
            System.out.println(b.getRateOfInterest());
        }
    }
}
