public final class MobileApp implements IFundingCallback {
    // 멤버 변수와 메서드 생략

    @Override
    public void onMoneyRaised(String backer, int amount) {
        // 모바일 앱에 알림을 보여준다.
        // backer, amount 모두 사용
    }
}
