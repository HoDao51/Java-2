package buoi8.LyThuyet.ISP.VD2.NonFixed;

import java.util.List;

public class LoanPayment implements Payment{
    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayment() {
        return List.of();
    }

    @Override
    public void initiateLoanSettement() {

    }

    @Override
    public void initiatePayments() {

    }

    @Override
    public void initiateRePayment() {

    }
}
