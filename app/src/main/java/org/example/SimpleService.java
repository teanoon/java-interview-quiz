package org.example;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    private static final int BIG_BRICK_SIZE = 5;
    private static final int SMALL_BRICK_SIZE = 2;

    /**
     * 使用大小砖填充空隙，判断给定数量的大小砖是否能刚好填满。
     *
     * 不能打碎砖块，不要求使用全部的砖块
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
     * 给定一个字符串，返回一个多组字符串组成的新字符串，其中每组字符都是原始字符串中对应字符的长度+字符。
     * 如 aabb -> 2a2b
     */
    public String lengthEncode(String input) {
        return null;
    }

    /**
     * 给定一个整数，返回其数字的反向编码。
     */
    public int reverse(int input) {
        return 0;
    }

}
