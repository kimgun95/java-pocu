public final class AmericanMenu extends Menu {
    // 다른 멤버 변수와 메서드는 모두 생략
    @Override
    public Cup createOrNull(CupSize size) {
        switch (size) {
            case SMALL:
                return new Cup(473);
            case MEDIUM:
                return new Cup(621);
            case LARGE:
                return new Cup(887);
            default:
                assert (false) : "Unhandled CupSize" + size;
                return null;
        }
    }
}
