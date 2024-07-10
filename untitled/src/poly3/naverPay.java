package poly3;

public class naverPay implements Pay {
    @Override
    public void payment(int amount) {
        System.out.println("naver 시스템에 연결 합니다");
        System.out.println(amount + " 원을 결제 합니다.");
        System.out.println("결제 성공");
        System.out.println("naver 시스템 연결을 해제합니다.");
    }
}
