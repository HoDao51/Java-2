package buoi7.baitap.bai3;

public class PaymentProcessor {
    public void paymentProcessor(PaymentMode paymentMode){
        if (paymentMode == paymentMode.CASH){
            CashPayment cashPayment = new CashPayment();
            cashPayment.acceptPayment();
        }else if (paymentMode == paymentMode.CREDIT_CARD){
            CreditCardPayment creditCardPayment = new CreditCardPayment();
            creditCardPayment.acceptPayment();
        }
    }
}
