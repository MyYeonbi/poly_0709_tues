package poly3;

public class PaySystem {
    private Pay paymentType;

    public void setPay(Pay pay){
        this.paymentType= pay;
    }
    public void payment(int amount){
        System.out.println("결제 시작합니다!");
        paymentType.payment(amount);

    }

}
