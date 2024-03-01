package org.example;

import static java.util.concurrent.ThreadLocalRandom.current;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class Database {
    public String getPrefixData() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException ignored) {
        }
        return String.format("prefix_%d", current().nextLong(1_000_000, 10_000_000));
    }

    public String getCompleteData(String prefix) {
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException ignored) {
        }
        return String.format("%s_suffix", prefix);
    }
}
