package org.example;

public class SimpleService {

    private static final int BIG_BRICK_SIZE = 5;
    private static final int SMALL_BRICK_SIZE = 2;

    boolean canFillGap(int smallQuantity, int bigQuantity, int totalGap) {
        int maxBigRequired = totalGap / BIG_BRICK_SIZE;
        if (maxBigRequired > bigQuantity) {
            return false;
        }

        int gapLeftMaxBigRequired = totalGap % BIG_BRICK_SIZE;
        if (smallQuantity * SMALL_BRICK_SIZE < gapLeftMaxBigRequired) {
            return false;
        }

        return gapLeftMaxBigRequired % BIG_BRICK_SIZE == 0;
    }

    public String lengthEncode(String input) {
        return null;
    }

    public int reverse(int input) {
        return 0;
    }

}
