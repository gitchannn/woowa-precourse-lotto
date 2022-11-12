package lotto.domain;

public enum Rank {
    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    NONE(0, 0);

    private final int match;
    private final int cashPrize;

    Rank(int match, int cashPrize) {
        this.match = match;
        this.cashPrize = cashPrize;
    }

    public int getMatch() {
        return match;
    }

    public int getCashPrize() {
        return cashPrize;
    }

}