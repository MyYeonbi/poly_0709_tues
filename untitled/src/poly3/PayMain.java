package poly3;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem= new PaySystem();

        kbPay kbPay = new kbPay();
        kakaoPay kakaoPay = new kakaoPay();
        naverPay naverPay = new naverPay();

        paySystem.setPay(naverPay);
        paySystem.payment(5000);

    }
}
