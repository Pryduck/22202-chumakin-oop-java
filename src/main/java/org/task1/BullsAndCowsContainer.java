package org.task1;

public class BullsAndCowsContainer {
    private final int bulls, cows;

    BullsAndCowsContainer(int bulls, int cows) {
        this.cows = cows;
        this.bulls = bulls;
    }

    public int getBulls() {
        return this.bulls;
    }

    public int getCows() {
        return this.cows;
    }
}
