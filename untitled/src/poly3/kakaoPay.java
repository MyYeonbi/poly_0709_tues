package poly3;

public class kakaoPay implements Pay {
    @Override
    public void payment(int amount) {
        System.out.println("kakao pay시스템에 연결합니다.. ");
        System.out.println(amount + "원을 결제합니다.");
        System.out.println("결제 성공");
        System.out.println("kakao pay 시스템 연결을 해제합니다.");

    }
}
