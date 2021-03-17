public final class KoreanMenu extends Menu {
    // 다른 멤버 변수 및 메서드 생략
    @Override
    public Cup createOrNull(CupSize size) {
        switch (size) {
            case SMALL:
                return new Cup(355);
            case MEDIUM:
                return new Cup(473);
            case LARGE:
                return new Cup(651);
            default:
                assert (false) : "Unhandled CupSize" + size;
                return null;
        }
    }
}
