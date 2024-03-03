package org.example;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class DatabaseClient {
    public int getValue1() {
        halt(10);
        return 100;
    }

    public int getSlowValue2() {
        halt(200);
        return 100;
    }

    public int sum(int a, int b) {
        halt(10);
        return a + b;
    }

    private void halt(long milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException ignored) {
        }
    }
}
