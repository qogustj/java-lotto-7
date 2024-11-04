package lotto.constant;

public class PrizeConstants {
    public static final long FIRST_PRIZE = 2_000_000_000;
    public static final int SECOND_PRIZE = 30_000_000;
    public static final int THIRD_PRIZE = 1_500_000;
    public static final int FOURTH_PRIZE = 50_000;
    public static final int FIFTH_PRIZE = 5_000;

    private PrizeConstants() {
        throw new AssertionError();
    }
}