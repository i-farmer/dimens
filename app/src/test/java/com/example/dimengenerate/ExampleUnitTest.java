package com.example.dimengenerate;

import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private final int[] target = {
            240,
            320,
            360,
            362,
            384,
            392,
            400,
            410,
            411,
            432,
            480,
            530,
            533,
            592,
            600,
            640,
            662,
            720,
            768,
            800,
            811,
            820,
            960,
            961,
            1024,
            1280,
            1365
    };

    @Test
    public void createDimen() {
        final double target = 768.d;
        create(target);
    }

    private void create(double width) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        buffer.append("<resources>");
        for (int i = 1; i <= 750; i++) {
            double a = width / 750 * i;
            DecimalFormat df = new DecimalFormat("#0.0000");
            buffer.append(" <dimen name=\"x" + i + "\">" + df.format(a) + "dp</dimen>");
        }
        for (int i = 1; i <= 750; i++) {
            double a = width / 750 * i;
            DecimalFormat df = new DecimalFormat("#0.0000");
            buffer.append(" <dimen name=\"m" + i + "\">-" + df.format(a) + "dp</dimen>");
        }
        buffer.append("</resources>");
        String result = buffer.toString();
    }
}