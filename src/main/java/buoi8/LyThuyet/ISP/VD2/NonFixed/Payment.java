package buoi8.LyThuyet.ISP.VD2.NonFixed;

import java.util.List;

public interface Payment {
    Object status();
    List<Object> getPayment();
    void initiateLoanSettement();
    void initiatePayments();
    void initiateRePayment();
}
