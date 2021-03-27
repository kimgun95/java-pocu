public final class BookkeepingApp implements IFundingCallback {
    // 멤버 변수와 메서드 생략

    @Override
    public void onMoneyRaised(String backer, int amount) {
        // 장부에 새 내역 추가
        // amount만 사용
    }
}
