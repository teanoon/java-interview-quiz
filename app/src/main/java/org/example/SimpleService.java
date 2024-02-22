package org.example;

public class SimpleService {

    private static final int BIG_BRICK_SIZE = 5;
    private static final int SMALL_BRICK_SIZE = 2;

    /**
     * given the gap and a few bricks, check if they can fill the gap
     */
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

    /**
     * given a string, encode it using length encoding
     */
    public String lengthEncode(String input) {
        return null;
    }

    /**
     * given an integer, reverse it
     */
    public int reverse(int input) {
        return 0;
    }

}
